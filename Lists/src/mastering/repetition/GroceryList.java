package mastering.repetition;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<>();
    public void addGroceryItem(String item){
        grocerylist.add(item);
    }

    public ArrayList<String> getGrocerylist() {
        return grocerylist;
    }

    public void printGroceryList(){
        System.out.println("you have "  +
             grocerylist.size() +
                " items in your grocery list"
                );
        for(int i=0; i<grocerylist.size();i++){
            System.out.println(i+1 + ". " +  grocerylist.get((i)));
        }

    }
    public void midifyGroceryItem(String currentItem, String newItem){
    int position = findItem(currentItem);
    if(position>= 0 ){
        midifyGroceryItem(position,newItem);
    }
    }
    private void midifyGroceryItem(int position, String newItem){
        grocerylist.set(position,newItem);
        System.out.println("grocery item " + (position+1)+ " has been modifed.");

    }
    public void removeGroceryItem(String newItem){
        int position = findItem(newItem);
        if(position>= 0 ){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int postion){
        String theItem = grocerylist.get(postion);
        grocerylist.remove(postion);
    }
    public int findItem(String searchItem) {

        return grocerylist.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int postion = findItem(searchItem);
        if(postion>=0){
            return true;
        }
        else {
            return false;
        }
    }
}
