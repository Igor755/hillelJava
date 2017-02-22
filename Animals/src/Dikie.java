/**
 * Created by Sonikpalms on 21.02.2017.
 */
public abstract class Dikie extends  Animal {

    boolean isPredator;

    public Dikie (int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public String voice() {
        String voice = super.voice() + "I am a dikii animal";
        if (isPredator) {
            voice += " and i am angry";
        }
        return voice;
    }
}