package mastering.repetition;

public class Square {
    public static boolean isSquare(int n) {
        if(Math.sqrt(n)*Math.sqrt(n)== n && Math.sqrt(n)== (int)Math.sqrt(n)) {
            System.out.println(Math.sqrt(n));
            return true; // fix me!
        }
        return false;
    }
}
