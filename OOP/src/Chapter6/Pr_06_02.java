package Chapter6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Pr_06_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("문장을 입력해주세요 >> ");
            String str = scanner.nextLine();

            if (str.equals("exit"))
            {
                break;
            }

            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

            int n = stringTokenizer.countTokens();
            System.out.println("어절의 개수는 " + n);

        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
