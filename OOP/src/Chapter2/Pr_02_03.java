package Chapter2;

import java.util.Scanner;

public class Pr_02_03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an X value : ");
        int x = input.nextInt();

        int y = (x*x) - (3*x) + 7;

        System.out.println("x = " + x + " y = " + y);

        input.close();
    }
}
