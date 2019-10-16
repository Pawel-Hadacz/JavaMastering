package mastering.repetition;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int Orginal = number;
        int primeNumber = Integer.MIN_VALUE;
        int divider;
        int couter = 0;
        if(number == 0 || number == 1){
            return -1;
        }
        for(int k = 1; k <= number;k++){
            if(Orginal%k==0){
                couter++;
            }
        }
        if(couter==2){
            return number;
        }
        for (int j = 2; j <number;){
            if(Orginal%j==0){
                divider = j;
                if(primeNumber < divider){
                    primeNumber = divider;
                }

                Orginal/=j;
            }else{
                j++;
            }
        }
        if(number>0 && primeNumber > 0 ){

            return primeNumber;
        }else{
            return -1;
        }
    }
}