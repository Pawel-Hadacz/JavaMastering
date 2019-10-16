package mastering.repetition;

public class Main {

    public static void main(String[] args) {
        /*int value = 1;
        if(value==1){
            System.out.println("Value was 1");
        }else if(value==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }*/
        int switchVal = 11;

        switch (switchVal){
            case 1:
                System.out.println("Val was 1");
                break;
            case 2:
                System.out.println("Val was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                break;
                default:
                    System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                    System.out.println("It was " + switchVal);
                    break;
        }
        final String LETTER_VAL="Znaleziono litere: ";
        char charVal = 'G';
        switch (charVal){
            case 'A':
                System.out.println(LETTER_VAL + charVal);
                break;
            case 'B':
                System.out.println(LETTER_VAL + charVal);
                break;
            case 'C':
                System.out.println(LETTER_VAL + charVal);
                break;
            case 'D':
                System.out.println(LETTER_VAL + charVal);
                break;
            case 'E':
                System.out.println(LETTER_VAL + charVal);
                break;
                default:
                    System.out.println("Nie znaleziono danych liter");

        }
        String month = "JUne";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("JAN");
                break;
            case "june":
                System.out.println("JUN");
                break;
                default:
                    System.out.println("Not sure");
        }
    }
}
