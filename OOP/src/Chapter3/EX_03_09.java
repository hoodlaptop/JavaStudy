package Chapter3;

public class EX_03_09
{
    public static void main(String[] args)
    {
        int [] n = { 1, 2, 3, 4, 5};
        int sum = 0;

        for (int k : n)
        {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("sum = " + sum);

        String f[] = {"Apple", "Pear", "Banana", "Cherry", "Strawberry", "Grape"};
        for (String s : f)
            System.out.print(s + " ");
    }
}
