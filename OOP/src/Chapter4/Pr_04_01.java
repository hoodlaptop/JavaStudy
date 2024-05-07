package Chapter4;

class Song
{
    private String title;

    public Song(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

}

public class Pr_04_01
{
    public static void main(String[] args)
    {
        Song mysong = new Song("My Song");
        Song yoursong = new Song("Your song");
        System.out.println("my song : " + mysong.getTitle());
        System.out.println("your song : " + yoursong.getTitle());
    }
}
