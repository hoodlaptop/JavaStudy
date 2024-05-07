package Chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pr_03_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Enter a number>>");
            int number = scanner.nextInt();

            if (number % 2 == 0)
            {
                System.out.println("even number");
            }
            else
            {
                System.out.println("odd number");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("your not entered number, exit");
        }
        finally
        {
            scanner.close();
        }

    }
}
