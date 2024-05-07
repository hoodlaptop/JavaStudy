package Chapter6;

import java.util.Scanner;

public class Ch_6_Assignment_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("게임하기(1), 끝내기(2) >> ");
            int choice = scanner.nextInt();

            if (choice == 2)
            {
                System.out.println("게임을 종료합니다.");
                break;
            }

            int userDice1 = (int) (Math.random() * 6) + 1;
            int userDice2 = (int) (Math.random() * 6) + 1;
            int userTotal = userDice1 + userDice2;

            int computerDice1 = (int) (Math.random() * 6) + 1;
            int computerDice2 = (int) (Math.random() * 6) + 1;
            int computerTotal = computerDice1 + computerDice2;

            System.out.println("사용자 " + userTotal + " : 컴퓨터 " + computerTotal);

            if (userTotal > computerTotal)
            {
                System.out.println("사용자가 이겼습니다.");
            }
            else if (userTotal < computerTotal)
            {
                System.out.println("컴퓨터가 이겼습니다.");

            }
            else
            {
                System.out.println("무승부입니다.");
            }

        }
        scanner.close();
    }
}
