package mastering.repetition;

import org.w3c.dom.ls.LSOutput;

import java.util.StringTokenizer;

public class Kata {
    // Simple, given a string of words, return the length of the shortest word(s).
    //
    //String will never be empty and you do not need to account for different data types.

    // version
    public static int findShort(String s){
        String[] words = s.split(" ");
        int shortest = words[0].length();
        for(String w : words){
            if(w.length()<=shortest){
                shortest = w.length();
            }
        }
        return shortest;
    }
    public static char findMissingLetter(char[] array)
    {
        for(int i = 0; i< array.length; i++){
            if(array[i+1] - array[i]> 1){
                return (char) (array[i] + 1);
            }
        }
        return 0;
    }
}
