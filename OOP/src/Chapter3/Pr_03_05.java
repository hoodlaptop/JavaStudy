package Chapter3;

import java.util.Scanner;

public class Pr_03_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number[] = new int[10];
        int temp;

        System.out.print("Enter 10 integer>>");
        for (int i = 0; i < 10; i++)
            number[i] = scanner.nextInt();

        for (int i = 0; i < 10; i++)
        {
            for (int j = i+1; j < 10; j++)
            {
                if (number[i] > number[j])
                {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++)
            System.out.print(number[i] + " ");


        scanner.close();
    }
}
