package Chapter8;

import javax.swing.*;
import java.awt.*;

public class EX_08_05 extends JFrame
{
    public EX_08_05()
    {
        super("GridLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new GridLayout(1, 10));

        for (int i = 0; i < 10; i++)
        {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            c.add(button);
        }
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args)
    {
            new EX_08_05();
    }
}
