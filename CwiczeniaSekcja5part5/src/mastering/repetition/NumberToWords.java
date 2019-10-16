package mastering.repetition;

public class NumberToWords {
    public static void numberToWords(int number){
        int formerNum = number;
        number = reverse(number);
        int digitDiff = getDigitCount(formerNum) - getDigitCount(number);
        if(number>0){
            while (number!=0){
                int extrac = number%10;
                number/=10;
                switch (extrac){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            for (int i = 1; i <= digitDiff; i++) {
                System.out.println("Zero");
            }
        }else if(number==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    public static int reverse(int numberToReverse){
            int reverseNum = 0;
            while(numberToReverse!=0) {
            int lastDigit = numberToReverse % 10;
            numberToReverse/=10;
            reverseNum = reverseNum *10 + lastDigit;


        }
        return reverseNum;
    }
    public static int getDigitCount(int number){
        int cout = 0;
        if(number>0){
        while(number!=0){
            number/=10;
            cout++;
        }
            return cout;
        }else if(number==0)   {
            return 1;
        }
        else{
            return -1;

        }

    }

}
