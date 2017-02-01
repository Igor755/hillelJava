/**
 * Created by Sonikpalms on 31.01.2017.
 */

import java.util.Scanner;

public class Arifm {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Please input first number: ");
        double num_1 = num.nextDouble();
        System.out.print("Please input second number: ");
        double num_2 = num.nextDouble();

        double num_3 = ((num_1 + num_2)/2);
        //int num_4 = (int)num_3;

        System.out.println("Arithmetical mean: " + num_3 );
    }
}