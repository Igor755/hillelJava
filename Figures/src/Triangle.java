/**
 * Created by Sonikpalms on 11.03.2017.
 */
public class Triangle extends Shape {

    public double fSide;
    public double sSide;
    public double tSide;

    public Triangle(double fSide, double sSide, double tSide) {
        this.fSide = fSide;
        this.sSide = sSide;
        this.tSide = tSide;
    }

    @Override
    double calculateArea() {
        return 0;
    }
}
