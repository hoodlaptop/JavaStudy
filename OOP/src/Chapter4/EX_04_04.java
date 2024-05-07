package Chapter4;

public class EX_04_04
{
    String title;
    String author;

    public EX_04_04(String t)
    {
        title = t;
        author = "NaN";
    }
    public EX_04_04(String t, String a)
    {
        title = t;
        author = a;
    }

    public static void main(String[] args)
    {
        EX_04_04 littlePrince = new EX_04_04("littlePrint", "NaN");

        EX_04_04 loveStory = new EX_04_04("loveStory");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
