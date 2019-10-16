package mastering.repetition;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int lastDigit;
        int sumOfEven = 0;
        if(number >=0){
            while (number!=0){
                lastDigit = number%10;
                number = number/10;
                if(lastDigit%2==0){
                    sumOfEven = sumOfEven + lastDigit;
                }
            }
            return sumOfEven;
        }else{
            return -1;
        }
    }
}
