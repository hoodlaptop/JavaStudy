package Chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX_03_14
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to 3 integer.");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++)
        {
            System.out.print(i+">>");
            try
            {
                n = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("it`s not integer, try again.");
                scanner.nextLine();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("sum " + sum);

        scanner.close();
    }
}
