package mastering.repetition;

public class Main {

    public static void main(String[] args) { 
        
        float MinFloatVal = Float.MIN_VALUE;
	    float MaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float min value " + MinFloatVal );
        System.out.println("Float max value " + MaxFloatVal );

        double MinDoubleVal = Double.MIN_VALUE;
        double MaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double min value " + MinDoubleVal );
        System.out.println("Double max value " + MaxDoubleVal );

        int IntVal = 5/3;
        float FloatVal = 5f /3;
        double DoubleVal = 5d /3;
        System.out.println(IntVal);
        System.out.println(FloatVal);
        System.out.println(DoubleVal);

        double pounds = 200;
        double poundToKg = pounds * 0.45359237;
        System.out.println(poundToKg);

        double pi = 3.1415927d;



    }
}
