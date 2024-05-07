package Chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pr_03_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday"};

        while (true)
        {
            try
            {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                if (number < 0)
                    break;

                System.out.println(week[number % 7]);
            }
            catch (InputMismatchException e)
            {
                System.out.println("Warring, plz enter a number!");
                scanner.nextLine();
                continue;
            }
        }
        scanner.close();
    }
}
