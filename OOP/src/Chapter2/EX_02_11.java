package Chapter2;

import java.util.Scanner;

public class EX_02_11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an age: ");

        int age = scanner.nextInt();
        if((age >= 20) && (age < 30))
        {
            System.out.print("You are Twenties.");
            System.out.println("I`m so happy because I`m in my 20s");
        }
        else
        {
            System.out.println("You are not Twenties.");
        }

        scanner.close();
    }
}
