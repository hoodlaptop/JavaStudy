package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pr_09_03 extends JFrame
{
    public Pr_09_03()
    {
        setTitle("드래깅동안");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);

        Pr_09_03.MyMouseListener listener = new Pr_09_03.MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(500, 500);
        setVisible(true);

    }

    class MyMouseListener extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            getContentPane().setBackground(Color.YELLOW);
        }

        @Override
        public void mouseMoved(MouseEvent e)
        {
            super.mouseMoved(e);
            getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args)
    {
        new Pr_09_03();
    }
}
