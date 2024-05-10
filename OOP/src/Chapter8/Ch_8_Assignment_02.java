package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Ch_8_Assignment_02 extends JFrame
{
    public Ch_8_Assignment_02()
    {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel textfield = new JPanel();
        textfield.setLayout(new FlowLayout());
        textfield.setBackground(Color.GRAY);
        textfield.add(new JLabel("수식"));
        textfield.add(new JTextField(10));
        textfield.add(new JLabel("결과"));
        textfield.add(new JTextField(5));
        textfield.setSize(400, 1);

        JPanel button = new JPanel();
        button.setLayout(new GridLayout(4, 4, 5, 5));
        button.setBackground(Color.YELLOW);

        JButton [] bin = new JButton[16];
        for (int i = 0 ; i <= 9 ; i++)
        {
            bin[i] = new JButton(Integer.toString(i));
            bin[i].setOpaque(true);
            button.add(bin[i]);
        }
        button.add(bin[10] = new JButton("CE"));
        button.add(bin[11] = new JButton("계산"));
        button.add(bin[12] = new JButton("+"));
        bin[12].setBackground(Color.GREEN);
        button.add(bin[13] = new JButton("-"));
        bin[13].setBackground(Color.GREEN);
        button.add(bin[14] = new JButton("X"));
        bin[14].setBackground(Color.GREEN);
        button.add(bin[15] = new JButton("/"));
        bin[15].setBackground(Color.GREEN);

        setSize(400, 300);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(textfield, BorderLayout.NORTH);
        container.add(button, BorderLayout.CENTER);
    }
    public static void main(String[] args)
    {
        new Ch_8_Assignment_02();
    }
}
