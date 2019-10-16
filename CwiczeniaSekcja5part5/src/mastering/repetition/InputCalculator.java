package mastering.repetition;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int cout = 0;
        double sum = 0;
        long avg;
        while(true){
            boolean isInt = scanner.hasNextInt();
                if(isInt){
                    int number = scanner.nextInt();
                    sum = sum + number;
                    cout++;
                    }
                else{
                    break;
                }
        }
        avg = Math.round(sum/cout);
        System.out.println("SUM = " + (int)sum + " AVG = " + avg);
        scanner.close();
    }

}
