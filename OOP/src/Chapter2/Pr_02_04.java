package Chapter2;

import java.util.Scanner;

public class Pr_02_04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x_1 = 50, y_1 = 50;
        int x_2 = 100, y_2 = 100;

        System.out.print("Enter the coordinates of the point : ");
        int inputX = input.nextInt();
        int inputY = input.nextInt();

        if (inputX >= x_1 && inputX <= x_2 && inputY >= y_1 && inputY <= y_2)
        {
            System.out.println("Point(" + inputX + ", " + inputY + ") is in (50, 50) and (100, 100) square");
        }
        else
            System.out.println("Point(" + inputX + ", " + inputY + ") is not in (50, 50) and (100, 100) square");

        input.close();
    }
}
