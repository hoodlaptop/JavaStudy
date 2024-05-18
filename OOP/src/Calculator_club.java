import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_club extends JFrame implements ActionListener
{
    private JTextField display;
    private JPanel panel;
    private String [] num_oper =
            { "7", "8", "9", "/",
              "4", "5", "6", "*",
              "7", "8", "9", "-",
              "0", ".", "=", "+",
              "CE"
    };
    private String operator = "";
    private double num1, num2, result;

    public Calculator_club()
    {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new BorderLayout());

        display = new JTextField();
        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        for (String text : num_oper)
        {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9'
        || command.equals("."))
            display.setText(display.getText() + command);
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/"))
        {
            operator = command;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
        else if (command.equals("="))
        {
            num2 = Double.parseDouble(display.getText());
            switch (operator)
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
            operator = "";
        }
        else if (command.equals("CE"))
        {
            display.setText("");
        }
    }

    public static void main(String[] args)
    {
        new Calculator_club();
    }
}
