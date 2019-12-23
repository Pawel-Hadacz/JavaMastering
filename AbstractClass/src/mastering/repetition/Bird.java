package mastering.repetition;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is birding");
    }

    @Override
    public void breathe() {
        System.out.println("bird's breathing");
    }

    @Override
    public void fly() {

    }
}
