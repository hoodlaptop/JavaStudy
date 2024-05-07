package Chapter6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch_6_Assignment_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print(">> ");
            String s = scanner.nextLine();
            StringBuffer result = new StringBuffer();

            if (s.equals("exit"))
            {
                System.out.println("종료합니다.");
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(s);
            while (tokenizer.hasMoreTokens())
            {
                String token = tokenizer.nextToken();
                int index = (int) (Math.random() * token.length());
                char c = (char) ('a' + (int) (Math.random() * 26));

                if (token.charAt(index) != c)
                {
                    token = token.replace(token.charAt(index), c);
                    result.append(token + " ");
                }

            }

            System.out.println(result);
        }

        scanner.close();
    }
}
