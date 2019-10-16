package mastering.repetition;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
   //  int [] myIntegers = getIntegers(readIntegers());
   //     System.out.println(findMin(myIntegers));
     /*
     printArray(myIntegers);
        System.out.println("Avarage: " +getAverage(myIntegers));
    int[] myIntArray = new int[20];
    myIntArray[5] = 50;
    for(int i=0; i < myIntArray.length;i++){
        myIntArray[i] = i * 10;
    }*/
    int [] ar = {2,4,6,2,3,1};
    int [] ar2 = {2,4,6,2,3,1,5,32,4};
    reverse(ar);
    reverse(ar2);
       // System.out.println(ar);
   // printArray(myIntegers);
  //  printArray(Desc.DescendingArray(myIntegers));
   // System.out.println(Arrays.toString(Desc.DescendingArray(myIntegers)));
    //    System.out.println(myIntegers);
    }

    public static void printArray(int array []){
            for(int i = 0; i<array.length;i++) {
                System.out.println((array[i]));
            }
        }

        public static int [] getIntegers(int number){
            System.out.println("Enter " + number + " integer values.\r");
            int[] values =new int[number];
            for(int i=0;i<values.length;i++){
                values[i] = scanner.nextInt();
            }
            return values;

        }
        public static double getAverage(int[] array){
        int sum = 0;
            for(int i = 0; i<array.length;i++) {
                sum += array[i];
            }
            return (double)sum/array.length;
        }
    public static int readIntegers(){
        System.out.println("How many numbers in array?");
        return  scanner.nextInt();

    }
    public static int findMin(int array[]){
        int min = array[0];
        for(int i = 0;i<array.length-1;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void reverse(int array[]){
        int [] reversed = array;
        int lenght = reversed.length;
        int temp;
        for(int i = 0;i<reversed.length;i++){
            if(i<lenght) {
                temp = reversed[i];
                reversed[i] = reversed[lenght - 1];
                reversed[lenght - 1] =temp;
                lenght--;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(reversed));
    }



    }


