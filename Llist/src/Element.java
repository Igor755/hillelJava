/**
 * Created by Sonikpalms on 08.03.2017.
 */
public class Element {

    Element next;
    Object data;

    public  Element(Element next, Object data) {
        this.next = next;
        this.data = data;
    }

    public Object getElement() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

}