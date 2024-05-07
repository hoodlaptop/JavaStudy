package Chapter4;

import java.util.Scanner;

class Rectangle
{
    int width, height;
    public int getArea()
    {
        return width * height;
    }
}

public class EX_04_02
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rectangle.width = scanner.nextInt();
        rectangle.height = scanner.nextInt();
        System.out.println("Area: " + rectangle.getArea());

        scanner.close();
    }
}
