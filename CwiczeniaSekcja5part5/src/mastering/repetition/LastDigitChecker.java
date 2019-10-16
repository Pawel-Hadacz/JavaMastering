package mastering.repetition;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int firstRight;
        int secondRight;
        int thirdRight;
        if(isValid(num1) && isValid(num2) && isValid(num3)){
          /*  System.out.println(num1 + "first");
            System.out.println(num2 + "scnd");
            System.out.println(num3 + "third");*/
            firstRight = num1%10;
            secondRight = num2%10;
            thirdRight = num3%10;
           /* System.out.println(firstRight + "first");
            System.out.println(secondRight + "scnd");
            System.out.println(thirdRight + "third");*/

            if(firstRight==secondRight || firstRight==thirdRight || secondRight == thirdRight){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
    public static boolean isValid(int number){
        if(number>=10 && number <=1000){
            return true;
        }
        else {
            return false;
        }
    }
}
