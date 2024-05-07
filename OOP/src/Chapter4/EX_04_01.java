package Chapter4;

public class EX_04_01
{

    int radius;
    String name;
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args)
    {
        EX_04_01 pizza;
        pizza = new EX_04_01();
        pizza.radius = 10;
        pizza.name = "Java Pizza";
        double area = pizza.getArea();
        System.out.println(pizza.name + "area = " + area);

        EX_04_01 donut = new EX_04_01();
        donut.radius = 2;
        donut.name = "Java Donut";
        area = donut.getArea();
        System.out.println(donut.name + "area = " + area);
    }
}
