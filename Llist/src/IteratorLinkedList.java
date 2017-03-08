import java.util.Iterator;

/**
 * Created by Sonikpalms on 08.03.2017.
 */
public class IteratorLinkedList  implements Iterator {


    private Element currentElement;

    public IteratorLinkedList(Element currentElement) {
        this.currentElement = currentElement;
    }

    @Override
    public boolean hasNext() {
        return currentElement != null;
    }

    @Override
    public Object next() {
//        if(currentElement==null){
//            throw new IndexOutOfBoundsException("");
//        }

        Object result = currentElement.data;
        currentElement = currentElement.next;
        return result;
    }






}