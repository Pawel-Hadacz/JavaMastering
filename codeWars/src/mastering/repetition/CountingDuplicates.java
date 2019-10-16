package mastering.repetition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int cout = 0;
        char x = ' ';
        HashSet<Character> listofChars = new HashSet<>();
        if (text.matches("^[a-zA-Z0-9]*")) {
            char[] array = text.toUpperCase().toCharArray();
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (listofChars.contains(array[i])) {
                        break;
                    }
                    if (array[i] == array[j]) {
                        x = array[i];
                        listofChars.add(x);
                        cout++;
                        break;

                    }
                }
            }
        }
        return cout;
    }
}
