package mastering.repetition;

public class House {
    private String street;
    private String colour;
    private int amontOfrooms;
    private int value;
    private Room room;

    public House(String street, String colour, int amontOfrooms, int value, Room room) {
        this.street = street;
        this.colour = colour;
        this.amontOfrooms = amontOfrooms;
        this.value = value;
        this.room = room;
    }

    public String getStreet() {
        return street;
    }

    public String getColour() {
        return colour;
    }

    public int getAmontOfrooms() {
        return amontOfrooms;
    }

    public int getValue() {
        return value;
    }

    public Room getRoom() {
        return room;
    }
}
