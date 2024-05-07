package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class EX_03_05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter to five number.");
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            int n = scanner.nextInt();
            if (n <= 0) continue;
            else sum += n;
        }
        System.out.println("Positive number sum : " + sum);

        scanner.close();
    }
}
