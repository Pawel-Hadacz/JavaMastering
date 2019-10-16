package mastering.repetition;

public class Main {
    public static void main(String[] args){
        byte b1 = 10;
        short s1 = 20;
        int i1 = 50;
        long l = (50000 +(10*(b1+s1+i1)));
        System.out.println(l);
        short shortSum = (short)(1000 + 10 *(b1+s1+i1));
        System.out.println(shortSum);
    }
}
