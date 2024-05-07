package Chapter2;

import java.util.Scanner;

public class Pr_02_02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("what`s your are Floor : ");
        int floor = input.nextInt();

        System.out.println((floor * 5) + "m");

        input.close();
    }
}
