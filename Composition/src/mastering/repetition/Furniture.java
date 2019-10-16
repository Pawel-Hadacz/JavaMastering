package mastering.repetition;

public class Furniture {
    private int weight;
    private int height;
    private String name;
    private String colour;

    public Furniture(int weight, int height, String name, String colour) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.colour = colour;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
