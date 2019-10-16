package mastering.repetition;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount = 5*bigCount;
        int sum = bigCount + smallCount;
        int newBig = 1;
        if(sum >= goal && goal>=0){
            if(bigCount==0 && smallCount >= goal){
                return true;
            }
                for(int i = 1; newBig < bigCount;){
                    newBig= 5*i;
                    int sum2 = newBig+smallCount;
                    if((newBig%goal==0 && (newBig + smallCount >= goal)) || (newBig<=goal && sum2>=goal) || (smallCount>goal)){
                        return true;
                }
                    else{i++;
                    }
            }
            }else{
            return false;
        }
        return false;
    }
    }

