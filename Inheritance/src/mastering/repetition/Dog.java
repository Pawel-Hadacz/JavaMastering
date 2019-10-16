package mastering.repetition;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog walking");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog running");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Move dog's legs");

    }
    @Override
    public void move(int speed){
        System.out.println("Dog move");
        moveLegs(speed);
        super.move(speed);
    }
}
