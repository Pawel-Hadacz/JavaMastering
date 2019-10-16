package mastering.repetition;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99)) {
            int orginalX = x;
            int orginalY = y;
            int lastDigit1 = 0;
            int lastDigit2 = 0;
            while (x != 0) {
               // System.out.println("przed % Lastdigit1 w petli x " + lastDigit1);
                lastDigit1 = x % 10;
             //   System.out.println("Lastdigit1 w petli x " + lastDigit1);
                while (y != 0) {
                   // System.out.println("przed % Lastdigit2 w petli y " + lastDigit2);
                    lastDigit2 = y % 10;
                   // System.out.println(" Lastdigit2 w petli y " + lastDigit2);
                    y = y / 10;
                    if (lastDigit1 == lastDigit2) {
                        return true;
                    }
                }
                y = orginalY;
                x = x / 10;
            }
            return false;
        }
        return false;

    }
}

