/**
 * Created by Sonikpalms on 21.02.2017.
 */
public abstract class Home extends Animal {

    String name;
    boolean isVactinated;

    public Home(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setVactinated(boolean vactinated) {
        isVactinated = vactinated;
    }

    public String voice() {
        return super.voice() + "my name is " + name + ". ";
    }
}