/**
 * Created by Sonikpalms on 08.02.2017.
 */
import java.util.Scanner;

public class Students {

    public static void main (String[] args)
    {
        Scanner num = new Scanner(System.in);
        //System.out.println("Введи число");
        String n = num.toString();

        //String[] arr = new String[n];
        //double[] arrD = new double[5];

        //addStudents(n);

        double [][] array = new double[5][];
        String[] start = new String[2];
        start[0] = "huhuhu";
        start[1] = "kokkok";

        addStudents(start, "njnjn");
        for(String  el:start)
        {
            System.out.println(el);
        }


    }
    public static String[] addStudents(String[] stud, String Student)
    {
        String[] result = new String[stud.length + 1];
        for (int i = 0; i < stud.length; i++)
        {
            result[i] = stud[i];

        }
        result[stud.length] = Student;

        return result;
    }


}
