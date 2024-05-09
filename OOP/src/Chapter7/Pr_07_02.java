package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_07_02
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {


        }

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a score(A/B/C/D/F): ");

            String grade = list.get(i);
            double gradeScore = 0.0;
            if (grade.equals("A"))
                gradeScore = 4.0;
            else if (grade.equals("B"))
                gradeScore = 3.0;
            else if (grade.equals("C"))
                gradeScore = 2.0;
            else if (grade.equals("D"))
                gradeScore = 1.0;
            else if (grade.equals("F"))
                gradeScore = 0.0;
            System.out.println(gradeScore);
        }

    }
}
