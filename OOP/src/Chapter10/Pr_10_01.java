package Chapter10;

import javax.swing.*;
import java.awt.*;

public class Pr_10_01 extends JFrame
{
    private JLabel[] labels = new JLabel[4];
    private ImageIcon[] icons = {new ImageIcon("images\\logo.png"),
    new ImageIcon("images\\logo2.png"),
    new ImageIcon("images\\logo3.png"),
    new ImageIcon("images\\logo4.png"),};

    public Pr_10_01()
    {
        setTitle("4 Images");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4));

        for(int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(icons[i]);
            c.add(labels[i]);
        }

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pr_10_01();
    }
}
