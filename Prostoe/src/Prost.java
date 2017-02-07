/**
 * Created by Sonikpalms on 07.02.2017.
 */
import java.util.Scanner;

public class Prost {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Please input chislo ");
        int num_1 = num.nextInt();
        num.close();
        System.out.println(PrNepro(num_1));

    }


    public static String PrNepro(int num_1)
    {
        String result = null;

        if (num_1 <= 1)

            result = "Chislo ne prostoe";

        if (num_1 == 2 || num_1 == 3)
            result = "Chislo prostoe";
        else

        {
            for (int i = 2; i * i <= num_1; i++)
            {
                if (num_1 % i == 0)

                {
                    result = "Choslo ne prostoe";
                    break;
                }
                else
                result = "Chislo prostoe";
            }
        }

        return result;
    }

}
