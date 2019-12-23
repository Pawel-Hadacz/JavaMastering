package mastering.repetition;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int draw = 0;

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()> team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else {
            return 0;
        }
    }

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){

        if(members.contains(player)){
            System.out.println(player.getName() + " jest juz w druzynie");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " dołącza do drużyny " + name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String res;
        if(ourScore>theirScore){
            won++;
            res = " wygrał z ";
        }else if(ourScore<theirScore){
            lost++;
            res = " przegrał z ";
        }else {
            draw++;
            res = " zremisował z ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName()+ res + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won*3) + draw;
    }

}
