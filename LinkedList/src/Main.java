import java.util.LinkedList;


/**
 * Created by Sonikpalms on 05.03.2017.
 */
public class Main {


        public static class Element {

            Element next;
            Object data;
        }

        public static class LinkedListOne {
            private Element head;
            private Element tail;
            int size = 0;


            public void addToStart(Object element) {
                Element newElement = new Element();
                newElement.data = element;
                if (head == null) {
                    head = newElement;
                    tail = newElement;
                } else {
                    newElement.next = head;
                    head = newElement;
                }
            }

            public void addToEnd(Object element) {
                Element newElement = new Element();
                newElement.data = element;
                if (tail == null) {
                    head = newElement;
                    tail = newElement;
                    size++;
                } else {
                    tail.next = newElement;
                    tail = newElement;
                    size++;
                }
            }
            public void print(){
                Element tmp = head;
                while(tmp != null){
                    System.out.println(tmp.data + " ");
                    tmp = tmp.next;
                }
            }
        }

    public static void main(String[] args) {
//        LinkedListOne list = new LinkedListOne();
//        list.addToEnd(1);
//        list.addToEnd(2);
//        list.addToEnd(3);
//        list.addToEnd(4);
//        list.addToEnd(5);
//        list.addToEnd(7);
//        list.print();
//        System.out.println(list.size);

        LinkList sheet = new LinkList();
        sheet.add(1);
        sheet.add(2);
        sheet.add(3);
        sheet.add(4);
        sheet.add(5);
        sheet.print();
        System.out.println(sheet.size());
    }
}


