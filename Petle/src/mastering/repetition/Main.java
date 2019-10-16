package mastering.repetition;



public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int maxSum = 0;
        for(int i = 1; i <1001; i++){
            if(i%3==0 && i%5==0){
                sum = sum + i;
                count++;
                System.out.println("Liczba podzielna przez 3 i 5: " + i);
                maxSum = maxSum + sum;
                if(count==5){
                    System.out.println("Koniec");
                    break;
                }
            }


        }
        System.out.println("suma: "+sum);
        System.out.println("suma sum " + maxSum);
        System.out.println(SumOddRange.isOdd(5));
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100)); // OUTPUT = 0 why?
        System.out.println(SumOddRange.sumOdd(100,1000));
        /*System.out.println("10000 at 2% interest = " + calcInterest(10000,2));
        for(int i=0; i<5;i++){
            System.out.println("Loop " + i );
        }
        for(int i=2; i<9;i++){

            System.out.println("10000 at " + i +"% interest = " + String.format("%.2f",calcInterest(10000,i)));
        }
        System.out.println("\n");
        for(int i=8; i>1;i--){
            System.out.println("10000 at " + i +"% interest = " + String.format("%.2f",calcInterest(10000,i)));
        }
        System.out.println(isPrime(2));
        int count = 0;
        for(int i = 10; i < 60; i++){
                if(isPrime(i)){
                System.out.println(i +" jest liczba pierwsza");
                count++;
                if(count == 10){
                    break;
                }
            }

        }
        System.out.println(count);*/
    }
    public static double calcInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= n/2;i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;

    }
}
