/**
 * Created by Sonikpalms on 21.02.2017.
 */
public class Fish extends Home {
    public Fish(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, false);
    }

    public String voice() {
        return "...............";
    }
}