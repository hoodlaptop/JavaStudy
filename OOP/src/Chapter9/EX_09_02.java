package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX_09_02 extends JFrame
{
    public EX_09_02()
    {
        setTitle("Action event listener example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Action");
        b1.addActionListener(new MYActionListener());
        c.add(b1);

        setSize(250, 120);
        setVisible(true);

    }

    private class MYActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");

            EX_09_02.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args)
    {
        new EX_09_02();
    }
}