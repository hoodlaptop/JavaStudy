package Chapter2;


import java.util.Scanner;

public class Pr_02_09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter to number by 1~99 >> ");
        int num = scanner.nextInt();

        int first = num/10;
        int second = num%10;

        if (num%3 == 0 || second%3 == 0)
            System.out.println("clap!calp!");
        else
            System.out.println("no clap!");

        scanner.close();
    }
}
