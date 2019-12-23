package mastering.repetition;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Cant flying");
    }
}
