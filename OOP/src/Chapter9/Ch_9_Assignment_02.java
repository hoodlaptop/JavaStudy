package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ch_9_Assignment_02 extends JFrame
{
    private JLabel[] labels = new JLabel[12];
    private int r, g, b;

    public Ch_9_Assignment_02()
    {
        setTitle("Ch_9_Assignment_02");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 3));

        for(int i = 0; i < 12; i++)
        {
            labels[i] = new JLabel(Integer.toString(i));
            labels[i].setOpaque(true);
            labels[i].setBackground(Color.WHITE);
            labels[i].addMouseListener(new MyMouseListener());
            c.add(labels[i]);
        }

        setSize(500, 500);
        setVisible(true);
    }

    private class MyMouseListener extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            JLabel la = (JLabel)e.getSource();
            if(e.getClickCount() == 2)
            {
                la.setBackground(Color.WHITE);
            }
            else
            {
                r = (int)(Math.random()*256);
                g = (int)(Math.random()*256);
                b = (int)(Math.random()*256);

                la.setOpaque(true);
                la.setBackground(new Color(r, g, b));
            }
        }
    }

    public static void main(String[] args)
    {
        new Ch_9_Assignment_02();
    }
}
