package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX_09_03 extends JFrame
{
    public EX_09_03()
    {
        setTitle("Action event listener example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Action");
        c.add(b1);
        b1.addActionListener(new MYActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");

                setTitle(b.getText());
            }
        });

        setSize(250, 120);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new EX_09_03();
    }
}