package mastering.repetition;

public class AreaCalculator {

    public static double area(double radius){
        if(radius >= 0){
            double circle = (Math.PI*(radius*radius));
            return circle;
        }else
            {
                return -1;
            }
    }
    public static double area(double x, double y){
        if(x >= 0 && y >=0){
            return x*y;

        }else
        {
            return -1;
        }
    }
}
