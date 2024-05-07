package Chapter3;

import java.util.Scanner;

public class EX_03_07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int intArray[];
        intArray = new int[5];
        int max = 0;
        System.out.println("Enter 5 positive numbers.");
        for (int i = 0; i < 5; i++)
        {
            intArray[i] = input.nextInt();
            if (intArray[i] > max)
                max = intArray[i];
        }
        System.out.println("The maximum value is " + max);

        input.close();
    }
}
