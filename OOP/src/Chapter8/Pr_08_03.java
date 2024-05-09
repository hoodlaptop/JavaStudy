package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Pr_08_03 extends JFrame
{
    public Pr_08_03()
    {
        setTitle("FlowLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        c.add(new JLabel("100 + 200"));
        c.add(new JButton("="));
        c.add(new JLabel("300"));

        setSize(300, 80);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pr_08_03();
    }
}
