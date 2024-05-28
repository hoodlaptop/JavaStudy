package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch_10_Assignment_02 extends JFrame
{
    private JTextField textField_1;
    private JTextField textField_2;
    private JRadioButton [] rb = new JRadioButton[4];
    private String [] rb_text = {"decimal", "binary", "octal", "hex"};
    private JTextArea historyArea;

    public Ch_10_Assignment_02()
    {
        setTitle("Ch_10_Assignment_02");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup bg = new ButtonGroup();

        textField_1 = new JTextField(10);
        textField_2 = new JTextField(10);

        c.add(textField_1);
        c.add(new JLabel("->"));
        c.add(textField_2);

        for(int i = 0; i < rb.length; i++)
        {
            rb[i] = new JRadioButton(rb_text[i]);
            c.add(rb[i]);
            rb[i].addItemListener(new MyItemListener());
            bg.add(rb[i]);
        }

        historyArea = new JTextArea(5, 20);
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        c.add(scrollPane);

        JButton resetButton = new JButton("초기화");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                historyArea.setText("");
            }
        });
        c.add(resetButton);

        setSize(300, 300);
        setVisible(true);
    }

    private class MyItemListener implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e)
        {
            if (e.getStateChange() == ItemEvent.SELECTED && !textField_1.getText().equals("")) {
                String result = "";
                if (e.getItem() == rb[0])
                {
                    result = Integer.toString(Integer.parseInt(textField_1.getText()));
                }
                else if (e.getItem() == rb[1])
                {
                    result = Integer.toBinaryString(Integer.parseInt(textField_1.getText()));
                }
                else if (e.getItem() == rb[2])
                {
                    result = Integer.toOctalString(Integer.parseInt(textField_1.getText()));
                }
                else
                {
                    result = Integer.toHexString(Integer.parseInt(textField_1.getText()));
                }
                textField_2.setText(result);
                historyArea.append(textField_1.getText() + " -> " + result + "\n");
            }
        }
    }

    public static void main(String[] args)
    {
        new Ch_10_Assignment_02();
    }
}
