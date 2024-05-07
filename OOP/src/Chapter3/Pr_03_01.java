package Chapter3;

import java.util.Scanner;

public class Pr_03_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter to alphabet>>");
        String alphabet = scanner.next();
        char c = alphabet.charAt(0);

        for (char i = 'a'; i <= c ; i++)
        {
            for (char j = i; j <= c; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
