/**
 * Created by Sonikpalms on 08.02.2017.
 */
import java.util.Scanner;

public class Finka {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введи число");
        int n = num.nextInt();

        System.out.println(fib(n));



    }

    public static int fib(int n)
    {

        if (n == 0)
        {
            return 0;
        }
                else
        {

            if ((n == -1) || (n == 1))
            {

                return 1;

            }
            else

            {

                if (n > 0)
                {

                    return fib(n - 1) + fib(n - 2);

                } else
                    {

                        return fib(n + 2) - fib(n + 1);


                        }
                    }





                }}}