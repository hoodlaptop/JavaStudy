package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_10_03 extends JFrame
{
    private JRadioButton [] rb = new JRadioButton[2];
    private String [] color = { "Red", "Blue" };

    public Pr_10_03()
    {
        this.setTitle("Two Radio Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup bg = new ButtonGroup();

        for (int i = 0; i < rb.length; i++)
        {
            rb[i] = new JRadioButton(color[i]);
            c.add(rb[i]);
            rb[i].addActionListener(new MyActionListener());
            bg.add(rb[i]);
        }

        this.setSize(300, 100);
        this.setVisible(true);
    }

    private class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Container c = getContentPane();
            if (e.getActionCommand().equals("Red"))
            {
                c.setBackground(Color.RED);
            }
            else
            {
                c.setBackground(Color.BLUE);
            }

        }
    }

    public static void main(String[] args)
    {
        new Pr_10_03();
    }
}
