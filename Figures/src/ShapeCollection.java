import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sonikpalms on 11.03.2017.
 */
public class ShapeCollection {

    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapes.add(shape);
    }
    public void removeShapes(Shape shape) {
        shapes.remove(shape);
    }

    public double totalCost(){
        double total = 0.0;
        for (Shape shape: shapes){
            total += shape.calculatePaintCost();

        }
        return total;

    }
    public double totalPaintSpent(){
        double total = 0.0;
        for (Shape shape: shapes){
            total += shape.calculatePaintSpent();

        }
        return total;

    }
    public double totalPaintArea(){
        double total = 0.0;
        for (Shape shape: shapes){
            total += shape.calculateArea();

        }
        return total;

    }
}
