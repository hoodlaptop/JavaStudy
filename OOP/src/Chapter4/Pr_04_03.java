package Chapter4;

import java.util.Scanner;

public class Pr_04_03
{
    static class Rect
    {
        private int width, height;

        public Rect(int width, int height)
        {
            this.width = width;
            this.height = height;
        }
        public int getArea() {return width * height;}
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int totalArea = 0;

        for (int i = 0 ; i < 4 ; i++)
        {
            System.out.print(i+1 + " Enter Width and Height: ");
            Rect rect = new Rect(scanner.nextInt(), scanner.nextInt());
            int area = rect.getArea();
            totalArea += area;
        }
        System.out.println("save...");
        System.out.println("Total Area: " + totalArea);

        scanner.close();
    }
}
