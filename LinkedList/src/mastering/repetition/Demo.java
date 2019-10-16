package mastering.repetition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo
{
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Warszawa");
        placesToVisit.add("Krakow");
        placesToVisit.add("Lublin");
        placesToVisit.add("Wrocław");
        placesToVisit.add("Katowice");
        placesToVisit.add("Płock");
        placesToVisit.add("Frampol");
        printList(placesToVisit);
        placesToVisit.add(1,"Biłgoraj");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
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
            }else if(comprasion < 0){

            }
        }
        return true;
    }
}
