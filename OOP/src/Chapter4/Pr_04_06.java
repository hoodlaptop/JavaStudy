package Chapter4;

public class Pr_04_06
{
    private int width, height;
    private char fillChar;

    public Pr_04_06( )
    {
        this.width = 10;
        this.height = 1;
    }
    public Pr_04_06(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public void draw()
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print(fillChar);
            }
            System.out.println();
        }
    }
    public void fill(char c)
    {
        fillChar = c;
    }

    public static void main(String[] args)
    {
        Pr_04_06 a = new Pr_04_06();
        Pr_04_06 b = new Pr_04_06(20, 3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();

    }
}
