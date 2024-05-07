package Chapter4;

class Circle_01
{
    int radious;
    public Circle_01(int radious)
    {
        this.radious = radious;
    }
    public double getArea()
    {
        return Math.PI * radious * radious;
    }
}

public class EX_04_06
{
    public static void main(String[] args)
    {
        Circle_01 [] c;
        c = new Circle_01[5];

        for (int i = 0; i < c.length; i++)
            c[i] = new Circle_01(i);

        for (int i = 0; i < c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
