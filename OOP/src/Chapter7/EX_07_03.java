package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_07_03
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter your name >>");
            String S = scanner.nextLine();
            a.add(S);
        }

        for (int i = 0; i < a.size(); i++)
        {
            String name = a.get(i);
            System.out.println(name + " ");
        }

        int longestIndex = 0;
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\n logestIndex is " + a.get(longestIndex));
        scanner.close();

    }
}
