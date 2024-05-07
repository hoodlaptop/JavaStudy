package Chapter8;

import javax.swing.*;
import java.awt.*;

public class EX_08_02 extends JFrame
{
    public EX_08_02()
    {
        setTitle("ContentPane and JFrame EX");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new EX_08_02();

        // EX_08_02 ex = new EX_08_02("Title")
        //ex.size();
        //ex.setVisivle();

    }
}
