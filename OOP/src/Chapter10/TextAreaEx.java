package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame
{
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7, 20);

    public TextAreaEx()
    {
        setTitle("Text Area Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Text"));
        c.add(tf);
        c.add(new JScrollPane(ta));

        tf.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                JTextField t = (JTextField) e.getSource();
                ta.append(t.getText() + "\n");
                t.setText("");
            }
        });

        setSize(300, 250);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new TextAreaEx();
    }
}
