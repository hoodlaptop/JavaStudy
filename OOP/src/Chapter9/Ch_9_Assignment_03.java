package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch_9_Assignment_03 extends JFrame implements ActionListener
{
    private JTextArea textArea;
    private String [] num_oper =
            { "통화", "지움", "종료",
                    "1", "2", "3",
                    "4", "5", "6",
                    "7", "8", "9",
                    "*", "0", "#",
            };

    public Ch_9_Assignment_03()
    {
        setTitle("전화걸기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(0, 0, 300, 60);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3));
        buttonPanel.setBounds(0, 60, 300, 300);

        for (String text : num_oper)
        {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        container.add(scrollPane);
        container.add(buttonPanel);

        setSize(300, 390);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String buttons = e.getActionCommand();

        if (buttons.charAt(0) >= '0' && buttons.charAt(0) <= '9')
            textArea.setText(textArea.getText() + buttons);
        else if (buttons.equals("통화"))
        {
            textArea.setText(textArea.getText() + "\n전화를 겁니다...");
        }
        else if (buttons.equals("종료"))
        {
            textArea.setText(textArea.getText() + "\n\n전화를 끊습니다.");
        }
        else
        {
            textArea.setText("");
        }
    }

    public static void main(String[] args)
    {
        new Ch_9_Assignment_03();
    }
}
