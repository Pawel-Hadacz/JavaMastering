package mastering.repetition;

public class Solution {
    public static boolean validatePin(String pin) {
        char[] charArray = pin.toCharArray();
            if((charArray.length == 4 || charArray.length == 6) && pin.matches("^[0-9]+")) {
            System.out.println(charArray.length);
            return true;
            }
             else{
              return false;
                }
    }
}

