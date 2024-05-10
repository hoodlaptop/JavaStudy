package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Pr_08_05 extends JFrame
{
    public Pr_08_05()
    {
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 4));

        Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
                Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK,
                Color.DARK_GRAY, Color.WHITE };

        JLabel[] labels = new JLabel[color.length];
        for (int i = 0; i < 16; i++)
        {
            labels[i] = new JLabel(Integer.toString(i));
            labels[i].setOpaque(true);
            labels[i].setBackground(color[i]);
        }
        add(new JLabel());
    }

    public static void main(String[] args)
    {

    }
}
