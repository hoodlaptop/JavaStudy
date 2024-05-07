package Chapter3;

public class Pr_03_07
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 99; i++)
        {
            int first = i / 10;
            int second = i % 10;
            int count = 0;

            if (first == 3 || first == 6 || first == 9)
            {
                count++;
            }
            if (second == 3 || second == 6 || second == 9)
            {
                count++;
            }

            if (count == 1)
            {
                System.out.println(i + " clap!");
            }
            else if (count == 2)
            {
                System.out.println(i + " clap!clap!");
            }

        }
    }
}
