/**
 * Created by Sonikpalms on 07.02.2017.
 */

import java.util.Scanner;

public class Summa {

    public static void main(String[] args)
    {
    Scanner num = new Scanner(System.in);
    System.out.println("Vvedi chislo");
    int num_1 = num.nextInt();

            int x = num_1;
            int s = 0;
            while (x != 0 ){
                s +=x%10;
                x /=10;
            }
            System.out.println("Сумма цифр в числе " + num_1 + " = " + s);
        }

    }

