package mastering.repetition;

public class Room {
    private int cost;
    private int length;
    private int weight;
    private Bed bed;

    public Room(int cost, int length, int weight, Bed bed) {
        this.cost = cost;
        this.length = length;
        this.weight = weight;
        this.bed = bed;
    }
    public void addBed(){
        bed.addBed();
        System.out.println("Bed add to room");
    }
    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public Bed getBed() {
        return bed;
    }
}
