package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_03_01 extends JFrame
{
    public Pr_11_03_01()
    {
        setTitle("두 이미지 나란히");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        private Image imgA = new ImageIcon("OOP/images/a.jpg").getImage();
        private Image imgB = new ImageIcon("OOP/images/b.jpg").getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imgA, 0, 0, getWidth()/2, getHeight(), this);
            g.drawImage(imgB, getWidth()/2, 0, getWidth()/2, getHeight(), this);
        }
    }

    public static void main(String[] args)
    {
        new Pr_11_03_01();
    }
}
