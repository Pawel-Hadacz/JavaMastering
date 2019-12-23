package mastering.repetition;

import java.util.List;

public abstract class ListItem {
    protected ListItem next;
    protected ListItem prev;

    protected Object val;

    public ListItem(Object val) {
        this.val = val;
    }

    abstract ListItem nextItem();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
