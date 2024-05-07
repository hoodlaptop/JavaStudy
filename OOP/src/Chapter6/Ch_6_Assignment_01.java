package Chapter6;

public class Ch_6_Assignment_01
{
    static class Mypoint
    {
        private int x, y;

        public Mypoint(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public String toString()
        {
            return "x=" + x + " ," + "y=" + y;
        }

        public boolean equals()
        {
            return this.x == this.y;
        }
    }

    public static void main(String[] args)
    {
        Mypoint a = new Mypoint(3, 20);
        System.out.println(a);
        System.out.println(a.equals());
    }
}
