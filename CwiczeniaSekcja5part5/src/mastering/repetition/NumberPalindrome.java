package mastering.repetition;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int OrginalNumber = number;
        if(number<=0){
            number = -number;
            OrginalNumber = -OrginalNumber;
        }
        while (number > 0) {
                int lastDigit = number % 10;
             //   System.out.println(lastDigit + " last digit");
                reverse = reverse * 10;
                //System.out.println("revere po przenożeniu " + reverse);
                reverse = reverse + lastDigit;
                number /= 10;
               // System.out.println(reverse + " reverse");

        }

        if(OrginalNumber==reverse) {
            return true;
        }
        return false;
    }
}
