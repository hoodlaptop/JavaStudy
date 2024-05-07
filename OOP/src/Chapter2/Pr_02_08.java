package Chapter2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pr_02_08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order to coffee>>");
        String coffee = scanner.next();
        int coffe_num = scanner.nextInt();

        if (coffee.equals("에스프레소"))
        {
            System.out.println((9000 * coffe_num) + "원입니다.");
        }

        else if (coffee.equals("아메리카노"))
        {
            System.out.println((2500 * coffe_num) + "원입니다.");
        }

        else if (coffee.equals("카페라떼"))
        {
            System.out.println((2500 * coffe_num) + "원입니다.");
        }
        else if (coffee.equals("카푸치노"))
        {
            System.out.println((3000 * coffe_num) + "원입니다.");
        }
        else
            System.out.println("Error");

        scanner.close();
    }
}
