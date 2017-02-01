/**
 * Created by Sonikpalms on 01.02.2017.
 */

import java.util.Scanner;

public class Proizvolarifmetic {

    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        System.out.print("Please input kolvo ");
        int num_1 = num.nextInt();
        double resul = 0;

        for ( int i = 1; i <= num_1; i ++)
        {
            System.out.print("Please input number: ");
            double num_i = num.nextDouble();
            resul = resul + num_i;
        }

        double num_3 = ((resul)/num_1);


        System.out.println("Arithmetical mean: " + num_3 );



    }
}
