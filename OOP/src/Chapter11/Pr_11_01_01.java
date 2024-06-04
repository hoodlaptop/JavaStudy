package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_01_01 extends JFrame
{
    public Pr_11_01_01()
    {
        setTitle("Pr_11_01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500,500);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.fillArc(5, 5, getWidth()-10, getHeight()-10, 90, 120);
            g.setColor(Color.BLUE);
            g.fillArc(5, 5, getWidth()-10, getHeight()-10, 210, 120);
            g.setColor(Color.YELLOW);
            g.fillArc(5, 5, getWidth()-10, getHeight()-10, 330, 120);

        }
    }

    public static void main(String[] args)
    {
        new Pr_11_01_01();
    }
}
