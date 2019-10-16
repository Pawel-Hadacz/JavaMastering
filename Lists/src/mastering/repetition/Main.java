package mastering.repetition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit){
            System.out.println("Eneter your choice: ");
            choice= s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }
    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice opitons");
        System.out.println("\t 1 - To print the list");
        System.out.println("\t 2 - To add");
        System.out.println("\t 3 - To modify");
        System.out.println("\t 4 - To remove");
        System.out.println("\t 5 - To search");
        System.out.println("\t 6 - To quit");

    }
    public static void addItem(){
        System.out.println("Add prod: ");
        groceryList.addGroceryItem(s.nextLine());
    }
    public static void modifyItem(){

        System.out.println("Enter cuurent name: ");
        String itemNo = s.nextLine();
        s.nextLine();
        System.out.println("Enter replacment");
        String newItem = s.nextLine();
        groceryList.midifyGroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter name of prod to remove: ");
        String intemNo = s.nextLine();
        groceryList.removeGroceryItem(intemNo);
    }
    public static void searchForItem(){
        System.out.println("Enter name of product");
        String name = s.nextLine();
        if(groceryList.onFile(name))
        { System.out.println("Found :" + name + " in list");
        }
        else{
            System.out.println(name + " cant find this item");
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGrocerylist());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGrocerylist());

        String[] myArray = new String[groceryList.getGrocerylist().size()];
        myArray = groceryList.getGrocerylist().toArray(myArray);
    }
}
