package Chapter3;

import java.util.Scanner;

public class EX_03_13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("Enter the dividend: ");
        dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = scanner.nextInt();
        try
        {
            System.out.println(dividend + "/" + divisor + "=" + dividend / divisor);
        }
        catch (ArithmeticException e)
        {
            System.out.println("you can't divide by zero");
        }
        finally
        {
            scanner.close();
        }
    }
}
