package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_09_01 extends JFrame
{
    private JLabel label = new JLabel("자기야");

    public Pr_09_01()
    {
        setTitle("마우스 올리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        c.add(label);
        label.setBounds(70, 10, 300, 30);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(200, 200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter
    {
        public void mouseEntered(MouseEvent e)
        {
            label.setText("사랑해");
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            super.mouseExited(e);
            label.setText("자기야");
        }
    }

    public static void main(String[] args)
    {
        new Pr_09_01();
    }
}
