package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Burek", 6,23,2,4,1,24,"short");
       // animal.eat();
        dog.eat();
      // dog.walk();
       dog.run();
    }
}
