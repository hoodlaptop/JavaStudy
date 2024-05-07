package Chapter3;

import java.util.Scanner;

public class EX_03_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two 5 number: ");
        int intArray[] = new int[5];
        double sum = 0;

        for (int i = 0; i < intArray.length; i++)
            intArray[i] = scanner.nextInt();

        for (int i = 0; i < intArray.length; i++)
            sum += intArray[i];

        System.out.print("average is " + sum / intArray.length);

        scanner.close();
    }
}
