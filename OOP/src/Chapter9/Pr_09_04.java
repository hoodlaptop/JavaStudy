package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pr_09_04 extends JFrame
{
    private JLabel la;

    public Pr_09_04()
    {
        setTitle("+-키로 폰트 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        la = new JLabel("LOVE JAVA");
        la.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(la);

        c.addKeyListener(new MyKeyListener());

        setSize(500, 500);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            int fontSize = la.getFont().getSize();

            if (keyCode == KeyEvent.VK_PLUS || keyCode == KeyEvent.VK_EQUALS) { // '+' 키는 보통 'Shift + ='로 처리됨
                la.setFont(new Font("Arial", Font.PLAIN, fontSize + 5));
            } else if (keyCode == KeyEvent.VK_MINUS) {
                la.setFont(new Font("Arial", Font.PLAIN, fontSize - 5));
            }
        }
    }

    public static void main(String[] args)
    {
        new Pr_09_04();
    }
}
