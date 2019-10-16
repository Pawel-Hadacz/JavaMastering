package mastering.repetition;

public class Main {

    public static void main(String[] args) {
       /* System.out.println(10 + 20 + "String");
        System.out.println("String" + 10 + 20);*/
       /*Dimensions dimensions1 = new Dimensions(20,20,5);
       Case case1 = new Case("22","Dell", "240",dimensions1);
       Monitor monitor1 = new Monitor("Gcxz2", "Acer", 27, new Resolution(2540,1440));
       Motherboard motherboard1 = new Motherboard("Cz-22", "Asus",4,6,"v2.44");
       PC PC1 = new PC(case1,monitor1,motherboard1);
       PC1.powerUp();*/

       Bed bed1 = new Bed(4,4,"Marian","Blue", 1 , 3,3,4);
       Room room1 = new Room(2444,23,24,bed1);
       room1.addBed();


    }
}
