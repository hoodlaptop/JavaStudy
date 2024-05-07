package Chapter4;

public class EX_04_03
{
    int radius;
    String name;

    public EX_04_03()
    {
        radius = 1;
        name = "";
    }

    public EX_04_03(int r, String n)
    {
        radius = r; name = n;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args)
    {
        EX_04_03 pizza = new EX_04_03(10, "Java Pizza");
        double area = pizza.getArea();
        System.out.println(pizza.name + "area = " + area);

        EX_04_03 donut = new EX_04_03();
        donut.radius = 2;
        donut.name = "Java Donut";
        area = donut.getArea();
        System.out.println(donut.name + "area = " + area);
    }
}
