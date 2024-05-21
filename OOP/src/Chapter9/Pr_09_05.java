package Chapter9;

import javax.swing.*;
import java.awt.*;

public class Pr_09_05 extends JFrame
{
    private JLabel la = new JLabel("C");

    public Pr_09_05()
    {
        setTitle("Pr_09_05");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(la);
        la.setLocation(50, 50);


        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pr_09_05();
    }
}
