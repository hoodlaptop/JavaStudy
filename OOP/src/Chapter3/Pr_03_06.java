package Chapter3;

import java.util.Scanner;

public class Pr_03_06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while (true)
        {
            System.out.print("Enter english>>");
            String input = scanner.nextLine();

            if (input.equals("exit"))
                break;

            boolean found = false;
            for (int i = 0; i < 5; i++)
            {
                if (input.equals(eng[i]))
                {
                    System.out.println("Kor:" + kor[i]);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                System.out.println("Word not found");
                continue;
            }
        }
        scanner.close();
    }
}
