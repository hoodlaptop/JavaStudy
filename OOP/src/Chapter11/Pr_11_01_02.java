package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_01_02 extends JFrame
{
    public Pr_11_01_02()
    {
        setTitle("오륜기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(300, 200);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawOval(50, 20, 60, 60);
            g.setColor(Color.BLACK);
            g.drawOval(120, 20, 60, 60);
            g.setColor(Color.RED);
            g.drawOval(190, 20, 60, 60);
            g.setColor(Color.YELLOW);
            g.drawOval(85, 45, 60, 60);
            g.setColor(Color.GREEN);
            g.drawOval(155, 45, 60, 60);

        }
    }

    public static void main(String[] args)
    {
        new Pr_11_01_02();
    }
}
