package Chapter3;

import java.util.Scanner;

public class EX_03_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter to Exit will be exit");
        while (true)
        {
            System.out.print(">>");
            String input = scanner.nextLine();
            if (input.equals("exit"))
                break;
        }
        System.out.println("It`s over...");

        scanner.close();
    }
}
