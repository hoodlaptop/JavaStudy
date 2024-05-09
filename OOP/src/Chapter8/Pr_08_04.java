package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Pr_08_04 extends JFrame
{
    public Pr_08_04()
    {
        setTitle("Ten Color Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new GridLayout(1, 10));

        Color [] color = {Color.RED, Color.orange, Color.yellow, Color.green,
                Color.cyan, Color.blue, Color.magenta, Color.gray,
                Color.pink, Color.lightGray};

        JButton [] bin = new JButton[10];
        for(int i = 0; i < 10; i++) {
            bin[i] = new JButton(Integer.toString(i));
            bin[i].setOpaque(true);
            bin[i].setBackground(color[i]);
            c.add(bin[i]);
        }

        setSize(400, 200);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new Pr_08_04();
    }
}
