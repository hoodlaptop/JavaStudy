package Chapter3;

import java.util.Scanner;

public class Pr_03_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str[] = {"rock", "scissors", "paper"};
        int n = (int)(Math.random() * 3);

        while (true)
        {
            System.out.println("playing rock-scissors-paper with computer.");
            System.out.print("rock-scissors-paper!");
            String user = scanner.nextLine();

            if (user.equals("exit"))
                break;

            System.out.print("user = " + user + " , ");
            System.out.print("computer = " + str[n] + " , ");

            if (str[n].equals(user))
            {
                System.out.println("Draw!");
            }
            if (user.equals("scissors") && str[n].equals("paper") ||
                    user.equals("paper") && str[n].equals("rock") ||
                    str[n].equals("rock") && str[n].equals("scissors"))
            {
                System.out.println("Win!");
            }
            else
                System.out.println("Lose!");
        }

        scanner.close();
    }
}
