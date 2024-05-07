package Chapter2;

import java.util.Scanner;

public class Pr_02_06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Money >>");
        int money = input.nextInt();

        int temp_50000, temp_10000, temp_1000,
                temp_500, temp_100, temp_10, temp_1;

            temp_50000= money / 50000;
            money %= 50000;

            temp_10000 = money / 10000;
            money %= 10000;

            temp_1000 = money / 1000;
            money %= 1000;

            temp_500 = money / 500;
            money %= 500;

            temp_100 = money / 100;
            money %= 100;

            temp_10 = money / 10;
            money %= 10;

            System.out.println("50000 = " + temp_50000 + ", 10000 = " + temp_10000 + ", 1000 = " + temp_1000 +
                    ", 500 = " + temp_500 + ", 100 = " + temp_100 + ", 10 = " + temp_10 + ", 1 = " + money);

        input.close();
    }
}
