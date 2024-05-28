package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_10_04 extends JFrame
{
    private JCheckBox[] checkBoxes = new JCheckBox[2];

    public Pr_10_04()
    {
        setTitle("CheckBox Visible");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        checkBoxes[0] = new JCheckBox("버튼 비활성화");
        checkBoxes[0].addActionListener(new MyActionListener());
        checkBoxes[1] = new JCheckBox("버튼 감추기");
        checkBoxes[1].addActionListener(new MyActionListener());

        JButton jButton = new JButton("Test button");

        c.add(checkBoxes[0]);
        c.add(checkBoxes[1]);



        setSize(300, 200);
        setVisible(true);
    }

    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            JButton button = (JButton) e.getSource();

            if (e.getActionCommand().equals("버튼 비활성화"))
            {

            }
        }
    }

    public static void main(String[] args)
    {
        new Pr_10_04();
    }
}
