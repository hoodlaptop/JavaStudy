package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Pr_08_02 extends JFrame
{
    public Pr_08_02()
    {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new BorderLayout(50, 5));

        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("North"), BorderLayout.NORTH);

        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pr_08_02();
    }
}
