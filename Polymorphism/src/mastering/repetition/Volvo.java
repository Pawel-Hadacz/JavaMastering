package mastering.repetition;

public class Volvo extends Car {

    public Volvo(String name,  int cylinders, String color, int speed) {
        super(name, cylinders, color, speed);
    }

    @Override
    public String startEngine() {
       return "Start Volvo Engine";
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
