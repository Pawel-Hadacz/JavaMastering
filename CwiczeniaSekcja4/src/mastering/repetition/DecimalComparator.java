package mastering.repetition;



public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y){
       x = x *1000;
       y = y *1000;
       x = (int)x;
       y = (int)y;
        System.out.println(x);
        System.out.println(y);
       return  x == y;
    }
}
