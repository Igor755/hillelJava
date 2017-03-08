import java.util.Iterator;
import java.util.List;
import java.util.Collection;
/**
 * Created by Sonikpalms on 08.03.2017.
 */
public class CollectionLinkedList implements Iterable {


    private Element first;



    @Override
    public Iterator iterator() {
        return new IteratorLinkedList(first);
    }

   public void add(Object o) {

        Element toAdd = new Element(null, o);
        if (first == null) {
            first = toAdd;
        }
        else {
            Element last = findLast();
            last.next = toAdd;
        }
    }

    private Element findLast() {
        Element current = first;
        if (current == null) {
            return null;
        }

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

}
