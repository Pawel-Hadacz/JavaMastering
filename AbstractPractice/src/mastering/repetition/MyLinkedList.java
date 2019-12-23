package mastering.repetition;

import java.util.List;

public class MyLinkedList implements NodeList {
    private ListItem root = null;
    private MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null ){
            int comparsion = (currentItem.compareTo(newItem));
            if(comparsion<0){
                if(currentItem.nextItem() != null){
                    currentItem = currentItem.nextItem();
                }else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }

            }else if(comparsion>0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }
                else {
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
                return true;
            }else {
                System.out.println(newItem.getVal()+ " is present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
