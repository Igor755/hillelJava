/**
 * Created by Sonikpalms on 27.01.2017.
 */

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Please input first number: ");
        double  num_1 = num.nextDouble();
        System.out.print("Please input second number: ");
        double  num_2 = num.nextDouble();
        System.out.println("Sum is: "  + (num_1 + num_2));
        System.out.println("Difference is: "  + (num_1 - num_2));
        System.out.println("Multiplication is: "  + (num_1 * num_2));
        System.out.println("Division is: "  + (num_1 / num_2));


    }
}