package mastering.repetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

        Examples:
        Input: 21445 Output: 54421

        Input: 145263 Output: 654321

        Input: 1254859723 Output: 9875543221
*/



public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<Character> list = new ArrayList<>();
        String numbers = Integer.toString(num);
        for(char c: numbers.toCharArray()){
            list.add(c);
        }
        Collections.sort(list, Collections.reverseOrder());
        String listString = list.stream().map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(listString);
        int val=Integer.parseInt(listString);
        return val;
    }
}
