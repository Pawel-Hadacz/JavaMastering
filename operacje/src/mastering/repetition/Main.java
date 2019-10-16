package mastering.repetition;

public class Main {

    public static void main(String[] args) {
	int result = 1 + 2;
        System.out.println(result);
        int prevRes = result;
        System.out.println("poprzedni rezulstat: " +prevRes);
        result = result - 1;
        System.out.println(result);
        System.out.println("poprzedni rezulstat: " +prevRes);
        result = result *10;
        System.out.println(result);

        result = result/5;
        System.out.println(result);
        result = result %3;
        System.out.println(result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);

        //result = result + 2;
        result+=2;
        System.out.println(result);
        //res= res*10
        result*=10;
        System.out.println(result);
        // res = res/3
        result/=3;
        System.out.println(result);
        // res = res -2
        result -=2;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("To nie jest kosmita");
            System.out.println("I ich sie boje");
        }

        int maxWynik = 100;
        if(maxWynik != 100){
            System.out.println("Nazwyzszy wynik!");}
        boolean czyToSamochod =true;
        boolean maszyna = czyToSamochod ? true:false;
        if(maszyna==true){
            System.out.println("to jest samochod");

            // CHALLENGE

            double valDouble = 20; // 1
            double valDouble2 = 80; //2

            double sumOf = (valDouble + valDouble2)*100; //3
            System.out.println(sumOf);
            double remainder = sumOf % 40;//4
            System.out.println(remainder);
            boolean dzieliBezReszty = remainder == 0?true:false;
            System.out.println(dzieliBezReszty);
            boolean czyBezReszty;
            if(remainder==0){
                czyBezReszty = true;
                System.out.println(czyBezReszty);
            }
            else {czyBezReszty= false;
                System.out.println(czyBezReszty);}
            //7
            if(dzieliBezReszty != true){
                System.out.println("Jest reszta");
            }
            if(czyBezReszty !=true){
                System.out.println("Jest reszta");
            }
        }


    }


}
