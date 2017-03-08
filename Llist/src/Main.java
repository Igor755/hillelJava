/**
 * Created by Sonikpalms on 08.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        CollectionLinkedList List = new CollectionLinkedList();
        List.add("First");
        List.add("Two");
        List.add("THree");


        for (Object o : List) {
            System.out.println(o);

        }
    }
}