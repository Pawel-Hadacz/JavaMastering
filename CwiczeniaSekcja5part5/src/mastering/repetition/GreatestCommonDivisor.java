package mastering.repetition;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int maxDivider = 0;
        int maxDivider2 = 0;
        int maxDiv = 0;

        if(first>=10 && second >= 10){
            for(int i = 1; i <= first; i++) {
                int divider1 = first % i;
                if (divider1 == 0) {
                    maxDivider = i;
                }
                for(int j = 1 ; j <= second; j++){
                    int divider2 = second % j;
                    if(divider2==0 ){
                        maxDivider2=j;
                    }
                    if(maxDivider2==maxDivider){
                       maxDiv = maxDivider2;
                    }
                }
            }
            return maxDiv;
            }
            return -1;
        }
        }


