package mastering.repetition;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long h = minutes/60;
            long days = h/24;
            long year = days/365;
            long remaindays = days % 365;
            System.out.println( minutes +" min = "+ year + " y and " +remaindays + " d");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    public static void printYearsAndDays2(long minutes){
        if(minutes >= 0){
            long year = (((minutes/60)/24)/365);
            long days = (((minutes/60)/24)%365);
            System.out.println( minutes +" min = "+ year + " y and " +days + " d");
        }
        else{
            System.out.println("Invalid Value");
            }

    }
}
