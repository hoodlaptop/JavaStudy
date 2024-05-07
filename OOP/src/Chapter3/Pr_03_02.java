package Chapter3;

import java.util.Scanner;

public class Pr_03_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10 integers>>");
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++)
        {
            n[i] = scanner.nextInt();
            if (n[i] % 3 == 0)
                System.out.print(n[i] + " ");
        }

        scanner.close();
    }
}
