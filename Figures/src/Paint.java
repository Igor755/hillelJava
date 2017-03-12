/**
 * Created by Sonikpalms on 11.03.2017.
 */
public class Paint {
    private final String colorName;
    private final double comsuptionPerSquare;
    private final Money price;

    public Paint(String colorName, double comsuptionPerSquare, Money price) {
        this.colorName = colorName;
        this.comsuptionPerSquare = comsuptionPerSquare;
        this.price = price;
    }

    public String getColorName() {
        return colorName;
    }

    public double getComsuptionPerSquare() {
        return comsuptionPerSquare;
    }

    public double getPrice() {
        return price.getAmount();
    }
}
