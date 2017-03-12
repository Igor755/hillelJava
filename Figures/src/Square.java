/**
 * Created by Sonikpalms on 11.03.2017.
 */
public class Square extends Shape {

    private double sideLengh;

    public Square(double sideLengh) {
        this.sideLengh = sideLengh;
    }

    @Override
    double calculateArea() {
        return sideLengh * sideLengh;
    }
}