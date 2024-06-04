package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_01_04 extends JFrame
{
    public Pr_11_01_04()
    {
        setTitle("Pr_11_01_04");
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

            int x = 0;
            int y = 0;
            for(int i = 0; i < 9; i++)
            {
                g.drawLine(getWidth()/10 + x, 0, getWidth()/10 + x, getHeight());
                g.drawLine(0, getHeight()/10 + y, getWidth(), getHeight()/10 + y);
                x += getWidth()/10;
                y += getHeight()/10;
            }
        }
    }

    public static void main(String[] args)
    {
        new Pr_11_01_04();
    }
}
