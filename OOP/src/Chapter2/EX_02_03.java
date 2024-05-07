package Chapter2;

public class EX_02_03
{
    public static void main(String[] args)
    {
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = PI * radius * radius;

        System.out.print("반지름 " + radius + ", ");
        System.out.println("원의 면적 = " + circleArea);
    }
}
