/**
 * Created by Sonikpalms on 01.02.2017.
 */
import java.util.Scanner;


public class Chetnechet {

    public static void main(String[] args)

    {

        Scanner num = new Scanner(System.in);
        System.out.print("Please input first number: ");
        int num_1 = num.nextInt();

        if(num_1 % 2 == 0)
        {
            System.out.print("Chetnoe");
        }
        else
        {
            System.out.print("Nechetnoe");
        }

    }
}