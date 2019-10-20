package mastering.repetition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Warszawa");
        addInOrder(placesToVisit, "Kraków");
        addInOrder(placesToVisit, "Lublin");
        addInOrder(placesToVisit, "Radom");
        addInOrder(placesToVisit, "Płock");
        addInOrder(placesToVisit, "Zakopane");
        addInOrder(placesToVisit, "Sopot");
        addInOrder(placesToVisit, "Frampol");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Wola");
        addInOrder(placesToVisit, "Sopot");
        printList(placesToVisit);
        visit(placesToVisit);


    }
    private static void printList(LinkedList<String> lisToPrint){
        Iterator<String> i = lisToPrint.iterator();
        while (i.hasNext()){
            System.out.println("Visiting " + i.next());
        }
        System.out.println("---------------------");
    }
    private static boolean addInOrder(LinkedList<String> stringLinkedList, String newCity){
        ListIterator<String> stringListIterator = stringLinkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comprasion = stringListIterator.next().compareTo(newCity);
            if(comprasion == 0){
                System.out.println(newCity + " is already included");
                return false;
            }else if(comprasion > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comprasion < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goFoward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no cities");
            return;
        }else {
            System.out.println("now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goFoward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goFoward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goFoward = false;
                    }
                    break;
                case 2:
                    if(goFoward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goFoward = false;
                    }
                   if(listIterator.hasPrevious()){
                       System.out.println("Now visiting " + listIterator.previous());
                   }else{
                       System.out.println("We are at the start of the list");
                       goFoward = true;
                   }
                    break;
                case 3:
                printMenu();
                break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Menu options");
        System.out.println("0 to quit\n " +
        "1 - next city\n" +
                "2 - prev city\n" +
                "3 - print menu");
    }
}
