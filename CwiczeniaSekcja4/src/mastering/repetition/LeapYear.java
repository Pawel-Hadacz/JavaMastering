package mastering.repetition;

public class LeapYear {
    public static boolean IsLeapYear(int year){
        if(year>=1 && year <= 9999){
            if(year%4==0 ){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else {
                        return false;
                    }
                }else{
                    return  true;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
}
