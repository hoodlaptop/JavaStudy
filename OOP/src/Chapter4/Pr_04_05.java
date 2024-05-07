package Chapter4;

class Circle
{
    private int radius;
    public Circle(int radius) {this.radius = radius;}
    public int getRadius() {return radius;}
    public void setRadius(int radius) {this.radius = radius;}
}
class CircleManager
{
    static void copy(Circle src, Circle dest)
    {
        dest.setRadius(src.getRadius());
    }
    static boolean equals(Circle a, Circle b)
    {
        if (a.getRadius() == b.getRadius())
            return true;
        else
            return false;
    }
}

public class Pr_04_05
{
    public static void main(String[] args)
    {
        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = CircleManager.equals(pizza, waffle);

        if (res == true)
            System.out.println("Pizza is the same as waffle");
        else
            System.out.println("Pizza is not the same as waffle");

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);

        if (res == true)
            System.out.println("Pizza is the same as waffle");
        else
            System.out.println("Pizza is not the same as waffle");
    }
}
