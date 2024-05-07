package Chapter2;

import java.util.Scanner;

public class Pr_02_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + "+" + b + " is " + (a + b));

        scanner.close();
    }
}
