package Chapter2;

import java.util.Scanner;

public class Pr_02_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your grade >>");
        char grade = scanner.next().charAt(0);

        switch (grade)
        {
            case 'A': case 'B':
                System.out.println("Excellent");
            break;
            case 'C': case 'D':
                System.out.println("GOOD");
            break;
            case 'F':
                System.out.println("Bye");
                break;
            default:
                System.out.println("Error");
                break;
        }

        scanner.close();
    }
}
