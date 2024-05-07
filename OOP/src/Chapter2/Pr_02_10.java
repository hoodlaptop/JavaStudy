package Chapter2;

import java.util.Scanner;

public class Pr_02_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order to coffee>>");
        String coffee = scanner.next();
        int coffe_num = scanner.nextInt();
        boolean sale = false;

        if (coffe_num >= 10)
            sale = true;

        if (coffee.equals("에스프레소"))
        {
            if (sale == true)
                System.out.println((2000 * coffe_num) - (2000 * 0.05 * coffe_num) + "원입니다.");
            else
                System.out.println((2000 * coffe_num) + "원입니다.");
        }
        else if (coffee.equals("아메리카노"))
        {
            if (sale == true)
                System.out.println((2500 * coffe_num) - ((2500 * coffe_num) * 0.05) + "원입니다.");
            else
                System.out.println((2500 * coffe_num) + "원입니다.");
        }
        else if (coffee.equals("카페라떼"))
        {
            if (sale == true)
                System.out.println((2500 * coffe_num) - ((2500 * coffe_num) * 0.05) + "원입니다.");
            else
                System.out.println((2500 * coffe_num) + "원입니다.");
        }
        else if (coffee.equals("카푸치노"))
        {
            if (sale == true)
                System.out.println((3000 * coffe_num) - ((3000 * coffe_num) * 0.05) + "원입니다.");
            else
                System.out.println((3000 * coffe_num) + "원입니다.");
        }
        else
            System.out.println("Error");
    }
}
