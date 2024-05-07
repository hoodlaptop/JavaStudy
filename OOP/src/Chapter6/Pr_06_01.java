package Chapter6;

class Mypoint
{
    private int point1, point2;

    public Mypoint(int point1, int point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    public String toString()
    {
        return "Chapter6.Mypoint(" + point1 + "," + point2 + ")";
    }
}

public class Pr_06_01
{
    public static void main(String[] args)
    {
        Mypoint a = new Mypoint(3, 20);
        System.out.println(a);
    }
}
