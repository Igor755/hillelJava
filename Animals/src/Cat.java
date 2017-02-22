/**
 * Created by Sonikpalms on 21.02.2017.
 */
public class Cat extends Home{
    public Cat(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String voice() {
        return super.voice() + " Meow...";
    }
}