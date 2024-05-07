package Chapter4;

public class EX_04_05
{
    String title;
    String author;

    void show()
    {
        System.out.println(title + " " + author);
    }

    public EX_04_05()
    {
        this("", "");
        System.out.println("create");
    }

    public EX_04_05(String title)
    {
        this(title, "NaN");
    }

    public EX_04_05(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args)
    {
        EX_04_05 a = new EX_04_05("Little", "SS");
        EX_04_05 b = new EX_04_05("CHUN");
        EX_04_05 c = new EX_04_05();

        b.show();
    }
}
