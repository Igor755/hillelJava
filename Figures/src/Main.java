/**
 * Created by Sonikpalms on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
       ShapeCollection shapeCollection = init();
       System.out.println(shapeCollection.totalCost());

    }
    public static ShapeCollection init(){

        Circle circle = new Circle(2);
        Square square = new Square(5);
        Money price = new Money(25);

        Paint orange = new Paint("orange",0.6,price);
        //Paint red = new Paint("red",2.1,14);

        circle.setPaint(orange);
        //square.setPaint(red);

        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShapes(circle);
        shapeCollection.addShapes(square);




        return shapeCollection;

    }


}
