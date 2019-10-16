package mastering.repetition;

public class Main {
    private static final String INVALID_VAL = "Invalid value";
    public static void main(String[] args) {
	String hours1 = getDurationString(65,45);
        System.out.println(hours1);
        String hours2 = getDurationString(3945);
        System.out.println(hours2);
        System.out.println(getDurationString(-42));
        System.out.println(getDurationString(70,8));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes>= 0 && (seconds >=0 && seconds<= 59)){
            int h = ((minutes * 60) + seconds)/3600;
            int sumMinutes = (minutes + (seconds/60));
            int newMinutes = (minutes + (seconds/60) - h*60);
            int newSeconds = (minutes*60 + seconds);
            String hoursString = h + " h ";
            if(h<10){
                hoursString = "0" + hoursString;
            }
            String minutesString = newMinutes + " min ";
            if(newMinutes<10){
                minutesString = "0" + minutesString;
            }
            String secondString = seconds + " sec ";
            if(seconds<10){
                secondString = "0" + secondString;
            }

            String s = "przeksztalcenie sumy na  " + h + " h " + sumMinutes + " min " + newSeconds + " sec, " ;
            return s + "przekształcony czas: " + hoursString + minutesString + secondString ;
        }
        else{
            return INVALID_VAL;
        }

        }
    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutesInSeconds = seconds / 60;
            int remeningSec = seconds % 60;
            return getDurationString(minutesInSeconds, remeningSec);
        }else
            {
            return INVALID_VAL;
            }
    }
}
