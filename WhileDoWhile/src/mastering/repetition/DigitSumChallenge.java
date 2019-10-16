package mastering.repetition;

public class DigitSumChallenge {

    public static int sumDigits(int number){
        int sum = 0;
        if(number>=10){
           while(number>0){
               int digit = number%10;
               System.out.println(digit + "digit");
               sum = sum + digit;
               System.out.println(sum + "suma");
               number /=10;
               System.out.println("number po dzieleniu przez 10: " + number);
           }
        }else {
            return -1;
        }

        return sum;
    }
}

