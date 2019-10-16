package mastering.repetition;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
A single die can only be counted once in each roll. For example, a "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   50 + 2 * 100 = 250
 1 1 1 3 1   1000 + 100 = 1100
 2 4 4 5 4   400 + 50 = 450
In some languages, it is possible to mutate the input to the function. This is something that you should never do. If you mutate the input, you will not be able to pass all the tests.*/

public class Greed {
    public static int greedy(int[] dice){
        int single = 0;
        int licznik1 = 0;
        int licznik2 = 0;
        for(int i = 0;i<dice.length;i++){
            if(dice[i] == 1){
                licznik1++;
            }else if(dice[i] == 5){
                licznik2++;
            }

        }
        if(licznik1 < 3 ){
            licznik1 = licznik1*100;
        }else if(licznik1 == 4){
            licznik1 = 100;
        }
        else if(licznik1 == 5){
            licznik1 = 200;
        }
        else {
            licznik1 = 0;
        }
        if(licznik2 < 3 ){
            licznik2 = licznik2*50;
        }else if(licznik2 == 4){
            licznik2 = 50;
        }
        else if(licznik2 == 5){
            licznik2 = 100;
        }
        else {
            licznik2 = 0;
        }

                List<Integer> duplicates = IntStream.of(dice)
                        .boxed()
                        .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
                        .entrySet()
                        .stream()
                        .filter(p -> p.getValue() >= 3 )
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

                int n = 10;
                if(duplicates.size()>0){
                     n = duplicates.get(0);
                }

      //  System.out.println(n + " n");

                //int triple = Integer.parseInt(t);
       // System.out.println(t + " t");
                int start = 0;
                switch (n){
                    case 2:
                        start = 200;
                        break;
                    case 3:
                        start = 300;
                        break;
                    case 4:
                        start = 400;
                        break;
                    case 5:
                        start = 500;
                        break;
                    case 6:
                        start = 600;
                        break;
                    case 1:
                        start = 1000;
                        break;
                }
                //   System.out.println(start+ " start");
                return start + licznik1 + licznik2;
            }
        }

