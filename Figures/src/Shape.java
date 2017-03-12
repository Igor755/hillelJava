/**
 * Created by Sonikpalms on 11.03.2017.
 */
public abstract class Shape {

    private Paint paint;

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    abstract double calculateArea();

    public  double calculatePaintSpent(){

        return calculateArea() * paint.getComsuptionPerSquare();

    }
    public  double calculatePaintCost(){
        return calculatePaintSpent() * paint.getPrice();

    }





}
