/**
 * Created by Sonikpalms on 21.02.2017.
 */
public class DogPov extends Home{
    boolean isTrained;

    public DogPov(int id, String name, int age, int weight, String color, boolean isVactinated, boolean isTrained) {
        super(id, name, age, weight, color, isVactinated);
        this.isTrained = isTrained;
    }

    public void takeHome() {
        if (isTrained) {

        }
        System.out.println("ok, go home!");
    }

    public String voice() {
        String voice = super.voice() + " Gav-Gav";
        if (isTrained) {
            voice += " I can take you home.";
        }
        return voice;
    }
}