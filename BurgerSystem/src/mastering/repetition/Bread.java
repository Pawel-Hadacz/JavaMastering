package mastering.repetition;

public class Bread {
    private String name;
    private int KCAL;
    private String size;

    public Bread(String name) {
        this.name = name;
    }

    public Bread(String name, int KCAL, String size) {
        this.name = name;
        this.KCAL = KCAL;
        this.size = size;
    }
}
