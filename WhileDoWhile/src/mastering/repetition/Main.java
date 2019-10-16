package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        System.out.println(DigitSumChallenge.sumDigits(125));
    //    System.out.println(DigitSumChallenge.sumDigits(-125));
     //   System.out.println(DigitSumChallenge.sumDigits(4));
     //   System.out.println(DigitSumChallenge.sumDigits(32123));
       // System.out.println(DigitSumChallenge.sumDigits(0));

       /* int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }*/
       /* count = 1;
        while (true){
            if(count==6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/
         /*count = 6;
         do{
             System.out.println("Count value is " + count);
             count++;

             if(count>100){
                 break;
             }
            }
        while(count != 6);*/

        /* int number = 4;
         int finishNumber = 20;
         while(number<=finishNumber){
             number++;
             if(isEvenNumber(number)){
                 System.out.println("Even number " + number);
             }
         }*/
       /* int number2 = 4;
        int finishNumber2 = 20;
        int total =0;
        int counter = 0;
        while(number2<=finishNumber2){
            number2++;
            if(isEvenNumber(number2)){
                total = total + number2;
                counter++;
                System.out.println(number2);
               if(counter>=5){
                   break;
               }
            }
        }
        System.out.println(total);*/
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
