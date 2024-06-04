package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_02 extends JFrame
{
    public Pr_11_02()
    {
        setTitle("이미지 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        public MyPanel() {
            setLayout(new FlowLayout());
            add(new JButton("Hello"));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            ImageIcon icon = new ImageIcon("OOP/images/b.jpg");
            Image img = icon.getImage();

            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

        }
    }

    public static void main(String[] args)
    {
        new Pr_11_02();
    }
}
