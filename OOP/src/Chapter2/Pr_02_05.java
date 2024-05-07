package Chapter2;

import java.util.Scanner;

public class Pr_02_05
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a logical operator >> ");
        boolean bool_1 = input.nextBoolean();
        String operator = input.next();
        boolean bool_2 = input.nextBoolean();

        switch (operator)
        {
            case "AND":
                System.out.println(bool_1 && bool_2);
            case "OR":
                System.out.println(bool_1 || bool_2);
        }

        input.close();
    }
}
