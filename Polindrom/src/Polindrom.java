/**
 * Created by Sonikpalms on 12.02.2017.
 */

import java.util.Scanner;

public class Polindrom {

    public static void main(String [] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Vvedi chislo");
        int num_1 = num.nextInt();

        System.out.println(isPalindrome(num_1));


    }

        public static boolean isPalindrome(Integer number){

        String original = number.toString();
        int i = original.length()-1;
        int j=0;

        while(i > j){
            if(original.charAt(i) != original.charAt(j)){
                return false;
            }

            i--;
            j++;
        }

        return true;
    }

    }


