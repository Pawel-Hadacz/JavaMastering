package mastering.repetition;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> ListOfObjects() {
        List<String> values = new ArrayList<>();
        values.add(0,name);
        values.add(1,String.valueOf(hitPoints));
        values.add(2,String.valueOf(strength));
        values.add(3,weapon);
        return values;
    }

    @Override
    public void ListPopulate(List<String> values) {
    if(values != null && values.size()>0){
        name = values.get(0);
        hitPoints = Integer.parseInt(values.get(1));
        strength = Integer.parseInt(values.get(2));
        weapon = values.get(3);
    }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
