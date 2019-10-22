package mastering.repetition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Player Tomek = new Player("Tomek", 10,15);
        System.out.println(Tomek);
        saveObject(Tomek);

        Tomek.setHitPoints(8);
        System.out.println(Tomek);
        Tomek.setWeapon("Axe");
        saveObject(Tomek);
        loadObject(Tomek);
        System.out.println(Tomek);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Options\n" +
                "1 - enter a string\n" +
                "0 - quit"
                );
        while (!quit){
            System.out.print("Select option: ");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i<objectToSave.ListOfObjects().size();i++){
            System.out.println("Saving " + objectToSave.ListOfObjects().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.ListPopulate(values);
    }
}
