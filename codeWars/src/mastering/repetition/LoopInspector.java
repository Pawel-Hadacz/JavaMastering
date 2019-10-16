package mastering.repetition;






import org.w3c.dom.Node;

import java.util.LinkedList;

public class LoopInspector {
    public int loopSize(Node node) {
        LinkedList<Node> drzewo = new LinkedList<Node>();
        for(int i = 0;i<drzewo.size();i++){
            System.out.println(drzewo.get(i));
        }

        return 1;
    }
}
