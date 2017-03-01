/**
 * Created by Sonikpalms on 28.02.2017.
 */
public class NewContainer {
    public static void main(String[] args){
        Container coll1 = new Container();
        Container coll2 = new Container();
        Object one = new Object();
        Object two = new Object();
        Object three = new Object();
        Object four = new Object();

        coll1.add(one);
        coll1.add(one);
        coll1.add(two);
        coll2.add(two);
        coll2.add(three);
        coll1.add(four);
        coll2.add(four);


        coll1.retainAll(coll2);

        for (int i = 0; i < coll1.size(); i++) {
            System.out.println(coll1.getObject(i));
        }
        System.out.println();

        System.out.println();
        System.out.println(coll1.getObject(0).equals(coll2.getObject(0)));
        System.out.println(coll1.getObject(1).equals(coll2.getObject(2)));
    }
}