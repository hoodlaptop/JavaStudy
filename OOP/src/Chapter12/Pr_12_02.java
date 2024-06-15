package Chapter12;

import javax.swing.*;
import java.awt.*;

public class Pr_12_02 extends JFrame
{
    public Pr_12_02()
    {
        setTitle("원을 0.5초 간격으로 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());
        Thread t = new Thread(new thread());
        t.start();

        setSize(500, 500);
        setVisible(true);
    }

    private class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            int x = (int)(Math.random()*(getWidth()-50));
            int y = (int)(Math.random()*(getHeight()-50));

            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
    }

    private class thread implements Runnable
    {
        public void run()
        {
            while(true)
            {
                repaint();
                try
                {
                    Thread.sleep(500);
                } catch(InterruptedException e) { return; }
            }
        }
    }

    public static void main(String[] args)
    {
        new Pr_12_02();
    }
}
