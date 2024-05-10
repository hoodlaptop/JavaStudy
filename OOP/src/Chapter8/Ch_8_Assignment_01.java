package Chapter8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ch_8_Assignment_01 extends JFrame
{
    public Ch_8_Assignment_01()
    {
        setTitle("Ch_8_Assignment_01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel up = new JPanel();
        up.setLayout(new BorderLayout(50, 5));

        up.add(new JButton("Center"), BorderLayout.CENTER);
        up.add(new JButton("South"), BorderLayout.SOUTH);
        up.add(new JButton("East"), BorderLayout.EAST);
        up.add(new JButton("West"), BorderLayout.WEST);
        up.add(new JButton("North"), BorderLayout.NORTH);

        JPanel down = new JPanel();
        down.setLayout(new GridLayout(1, 10));

        Color [] color = {Color.RED, Color.orange, Color.yellow, Color.green,
                Color.cyan, Color.blue, Color.magenta, Color.gray,
                Color.pink, Color.lightGray};

        Random random = new Random();

        JButton [] bin = new JButton[10];
        for(int i = 0; i < 10; i++) {
            bin[i] = new JButton(Integer.toString(i));
            bin[i].setOpaque(true);
            bin[i].setBackground(color[random.nextInt(10)]);
            down.add(bin[i]);
        }

        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
        container.add(up);
        container.add(down);

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Ch_8_Assignment_01();
    }
}
