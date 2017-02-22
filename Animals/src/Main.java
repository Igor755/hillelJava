/**
 * Created by Sonikpalms on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {

    Wolf volk = new Wolf(100, 275,150, "black", true);
    System.out.println(volk.voice());

    Fish ribka = new Fish(1000,"Jonik",5, 15, "zolotaya", true);
    System.out.println(ribka.voice());

    Giraf girafik = new Giraf(3000,7, 15, "blue", true);
    System.out.println(girafik.voice());



}
}