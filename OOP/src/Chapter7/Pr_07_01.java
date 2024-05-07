package Chapter7;

import java.util.Scanner;
import java.util.Vector;

public class Pr_07_01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Vector<Float> v = new Vector<>();

        int longestIndex = 0;
        for (int i = 0; i < 5; i++)
        {
            v.add(input.nextFloat());

            if (v.get(longestIndex) < v.get(i))
                longestIndex = i;
        }

        System.out.println("The longest index is " + v.get(longestIndex));

    }
}
