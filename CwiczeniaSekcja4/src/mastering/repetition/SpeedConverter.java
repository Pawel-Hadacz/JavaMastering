package mastering.repetition;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour >=0 ){
            kilometersPerHour = Math.round(kilometersPerHour /1.609);
            return (long)kilometersPerHour;
        }else
            return -1;
    }
    public static void printConversion(double kilometersPerHour){
        double milesPerHour;
        if(kilometersPerHour >= 0){
            milesPerHour = Math.round(kilometersPerHour /1.609);
            System.out.println(kilometersPerHour + " km/h = " + (int)milesPerHour + " mi/h");}
        else{
            System.out.println("Invalid Value");
        }
    }
    public static void printConversion2(double kilometersPerHour){
        long milesPerHour;
        if(kilometersPerHour >= 0){
            milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + (int)milesPerHour + " mi/h");}
        else{
            System.out.println("Invalid Value");
        }
    }
}
