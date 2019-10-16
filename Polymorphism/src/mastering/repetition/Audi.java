package mastering.repetition;

public class Audi extends  Car {
    public Audi(String name,  int cylinders, String color,  int speed) {
        super(name, cylinders, color, speed);
    }

    @Override
    public String startEngine() {
       return "Start Audi Engine";
    }

    @Override
    public void accelerate(int increase) {
        super.accelerate(increase);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
