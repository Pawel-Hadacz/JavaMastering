package mastering.repetition;

public class isogram {
    public static boolean isIsogram(String str) {
        char[] word = str.toLowerCase().toCharArray();
        for(int i = 0;i < word.length; i++){
            for(int j = i + 1;j < word.length ; j++){
            if(word[i] == word[j]){
            return false;
            }
            }
        }return true;

    }
}
