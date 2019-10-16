package mastering.repetition;

public class Toyota extends Car {
    public Toyota(String name, int cylinders, String color,  int speed) {
        super(name,  cylinders, color, speed);
    }

    @Override
    public String startEngine() {
        return "Start Toyota Engine";
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
