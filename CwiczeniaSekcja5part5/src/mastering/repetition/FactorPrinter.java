package mastering.repetition;

public class FactorPrinter {
    public static void printFactors(int number){
        int factor;
        if(number>=0){
            for(int i = 1;i <= number; i++ ){
             //   System.out.println(i + " i ");
             //   System.out.println(number + " num ");
                factor = number%i;
              //  System.out.println(factor + "factor");
                if(factor==0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
