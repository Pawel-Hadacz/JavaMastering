package mastering.repetition;

public class Main {
    public static double losowanie(){
        double random = Math.random();
        return random;
    }

    public static void main(String[] args) {
      // 1
        byte number = (byte)170;
        if((number & 1) == 1){
            System.out.println("liczba jest nieparzysta " + number);
        }else {
            System.out.println("liczba jest parzysta " + number);
        }
    // 2
        int n = 5;
        System.out.println(losowanie());










    }
}
