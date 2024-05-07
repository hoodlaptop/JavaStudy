package Chapter3;

import java.util.Scanner;

public class EX_03_12
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

        System.out.println(dividend + "/" + divisor + " = " + dividend / divisor);
    }
}
