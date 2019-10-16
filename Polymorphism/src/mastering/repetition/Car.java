package mastering.repetition;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private String color;
    private int wheels;
    private int speed;


    public Car(String name,  int cylinders, String color, int speed) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.color = color;
        this.wheels = 4;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine(){
       return "Start Engine";
    }
    public void accelerate(int increase){
        speed = speed + increase;
    }
    public void brake(){
        speed = 0;
    }
}
