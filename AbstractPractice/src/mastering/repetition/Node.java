package mastering.repetition;

public class Node extends ListItem {
    public Node(Object val) {
        super(val);
    }

    @Override
    ListItem nextItem() {
        return next;

    }

    @Override
    ListItem setNext(ListItem item) {
        next = item;
        return next;
    }

    @Override
    ListItem previous() {
        return prev;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        prev = item;
        return prev;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getVal()).compareTo((String) item.getVal());
        }else {
            return -1;
        }
    }
}
