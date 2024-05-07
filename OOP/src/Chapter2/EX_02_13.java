package Chapter2;

import java.util.Scanner;

public class EX_02_13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Score: ");
        int score = scanner.nextInt();
        System.out.print("Enter an year: ");
        int year = scanner.nextInt();

        if(score >= 60)
        {
            if (year != 4)
            {
                System.out.println("Accepted!");
            }
            else if (score >= 70)
            {
                System.out.println("Accepted!");
            }
            else
            {
                System.out.println("Failed");
            }
        }

        scanner.close();
    }
}
