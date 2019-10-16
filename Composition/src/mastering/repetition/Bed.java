package mastering.repetition;

public class Bed extends Furniture{
    private int BedId;
    private int numberOfPillows;
    private int height;
    private int sheets;

    public Bed(int weight, int height, String name, String colour, int bedId, int numberOfPillows, int height1, int sheets) {
        super(weight, height, name, colour);
        BedId = bedId;
        this.numberOfPillows = numberOfPillows;
        this.height = height1;
        this.sheets = sheets;
    }
    public void addBed(){
        System.out.println("Adding Bed");
    }

    public int getBedId() {
        return BedId;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
}
