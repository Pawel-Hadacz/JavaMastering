package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        Car ford = new Car();
        Car lada = new Car();

        ford.setModel("Mustang");
        lada.setModel("G2");
        System.out.println(ford.getModel());
        System.out.println(lada.getModel());


    }
}
