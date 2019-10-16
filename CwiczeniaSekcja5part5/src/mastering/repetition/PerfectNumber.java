package mastering.repetition;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int cout = 1;
        int sum = 0;
        int orginalNum = number;
        if(number >=0){
            while (cout<=number){
              //  System.out.println(number + " numer");
                if(number%cout==0){
                    sum = sum + cout;
                   // System.out.println("sum: " + sum);
                    //System.out.println("count " +cout);
                    cout++;
                }else{
                    cout++;
                }

                if(orginalNum==sum){
                    return true;
                }
              //  System.out.println(orginalNum + " Orginal number");

            }
            return false;
        }
            return false;
    }
}
