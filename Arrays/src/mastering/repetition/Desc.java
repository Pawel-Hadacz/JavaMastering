package mastering.repetition;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Desc {
    public static int[] DescendingArray(int []array) {
        int x;
        int maxfinal = Integer.MIN_VALUE;
        /*int[] arraySorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           arraySorted[i] = array[i];
        }*/
        int[] arraySorted = Arrays.copyOf(array,array.length);
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0;i<arraySorted.length-1;i++){
                if(arraySorted[i] < arraySorted[i+1]){
                    x = arraySorted[i];
                    arraySorted[i] = arraySorted[i+1];
                    arraySorted[i+1] = x;
                    flag = true;
                }
            }
        }
      //  return Arrays.stream(array).sorted().toArray();
        return arraySorted;
    }
        public static void printArray2(int array []){
            for(int i = 0; i<array.length;i++) {
                System.out.println((array[i]));
            }
        }

       // System.out.println(arraySorted);



    }

