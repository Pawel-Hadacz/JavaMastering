package mastering.repetition;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Line {
    public static String WhoIsNext(String[] names, int n)
    {

        LinkedList<String> kolejka = new LinkedList<>();
        for(int i = 0;i<names.length;i++){
            kolejka.add(names[i]);
        }
        for(int j = 0;j<n;j++){
            String peek = kolejka.peek();

                kolejka.add(peek);
                kolejka.add(peek);
                kolejka.remove(peek);

        }
        System.out.println(kolejka);
        return kolejka.getLast();
    }
}
/*Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending machine; there are no other people in the queue. The first one in the queue (Sheldon) buys a can, drinks it and doubles! The resulting two Sheldons go to the end of the queue. Then the next in the queue (Leonard) buys a can, drinks it and gets to the end of the queue as two Leonards, and so on.

        For example, Penny drinks the third can of cola and the queue will look like this:

        Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny*/
