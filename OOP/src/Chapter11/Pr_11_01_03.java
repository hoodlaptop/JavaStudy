package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_01_03 extends JFrame
{
    public Pr_11_01_03()
    {
        setTitle("Pr_11_01_03");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            int [] x = { getWidth()/2, 0, getWidth()/2, getWidth() };
            int [] y = { 0, getHeight()/2, getHeight(), getHeight()/2 };

            g.setColor(Color.BLUE);
            g.drawPolygon(x, y, 4);
        }
    }

    public static void main(String[] args)
    {
        new Pr_11_01_03();
    }
}
