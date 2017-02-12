/**
 * Created by Sonikpalms on 12.02.2017.
 */

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Vvedi chislo");
        int num_1 = num.nextInt();
        int num_2 = 0;


        while (num_1 > 0) {
            num_2 = num_2 * 10 + num_1 % 10;
            num_1 = num_1 / 10;

        }
        System.out.println(num_2);

    }


}

