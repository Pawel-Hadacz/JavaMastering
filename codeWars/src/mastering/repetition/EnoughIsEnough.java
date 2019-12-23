package mastering.repetition;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {List<Integer> sortedPhotos = Arrays.stream(elements).boxed().collect(Collectors.toList());
        sortedPhotos.stream().filter(i -> Collections.frequency(sortedPhotos,i) <= 1)
                .collect(Collectors.toList());
        System.out.println(sortedPhotos);

        int [] expectedArray = new int[elements.length];
        for(int i=0;i<elements.length;i++){
            expectedArray[i] = sortedPhotos.get(i);
        }
        return expectedArray;
    }

}
