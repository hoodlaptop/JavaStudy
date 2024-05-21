package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_09_02 extends JFrame
{
    public Pr_09_02()
    {
        setTitle("키 누르기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.CYAN);
        c.addKeyListener(new MyKeyListener());

        setSize(500, 500);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R')
            {
                getContentPane().setBackground(Color.red);
            }
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R')
            {
                getContentPane().setBackground(Color.CYAN);
            }
        }

    }

    public static void main(String[] args)
    {
        new Pr_09_02();
    }
}
