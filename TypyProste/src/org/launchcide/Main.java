package org.launchcide;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int MinIntValue = Integer.MIN_VALUE;
        int MaxIntValue = Integer.MAX_VALUE;
        System.out.println("najmniejszy int:" +  MinIntValue);
        System.out.println("najwiekszy int: " + MaxIntValue);
        System.out.println("niemozliwa max value " + (MaxIntValue + 1) + " overflow ");
        System.out.println("niemozliwa min value " + (MinIntValue - 1) + " underflow ");

        byte MinByteValue = Byte.MIN_VALUE;
        byte MaxByteValue = Byte.MAX_VALUE;
        System.out.println("najmniejszy byte: " + MinByteValue);
        System.out.println("najwiekszy byte: " + MaxByteValue);

        short MinShortValue = Short.MIN_VALUE;
        short MaxShortValue = Short.MAX_VALUE;
        System.out.println("najmniejszy short: " + MinShortValue);
        System.out.println("najwiekszy short: " + MaxShortValue);

        long LongValue= 100L;

        long MinLongValue = Long.MIN_VALUE;
        long MaxLongValue = Long.MAX_VALUE;
        System.out.println("najmniejszy long: " + MinLongValue);
        System.out.println("najwiekszy long: " + MaxLongValue);
       // long bigValue = 2147483648; blad o nie mieści sie w intcie trzeba pokazać że chodzi nam o longa
        long bigValue = 21474836489L;
        System.out.println(bigValue);

        int sum = (MinIntValue / 2);
        System.out.println(sum);
        byte NewByteVal = (byte)(MinByteValue / 2);
      //  byte NewByteVal3 = (MinByteValue + 2); nie przez dzialanie traktowane jest jako int
        byte NewByteVal2 = (-128 / 2);
        System.out.println(NewByteVal);
        System.out.println(NewByteVal2);
        byte NewByteVal5 = (byte)(MinByteValue + MinByteValue +1 +22);
        System.out.println(NewByteVal5);


    }
}
