package mastering.repetition;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = 0;
        int Orignalnumber = number;
            if (number >= 0) {
                if (Orignalnumber > 9) {
                while (number != 0) {
                    if (number == Orignalnumber) {
                        lastDigit = number % 10;
                    }
                    System.out.println("Ostatnia cyfra: " + lastDigit);
                    number = number / 10;
                    System.out.println("number przed petla: " + number);
                    if (number > 0 && number <= 9) {
                        firstDigit = number;
                        System.out.println("pierwsza cyfra: " + firstDigit);
                    }
                }
                } else {
                    return Orignalnumber + Orignalnumber;
                }
                return firstDigit + lastDigit;
            }
            else{
                return -1;
            }
        }

    }

