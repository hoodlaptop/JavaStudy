package Chapter11;

import javax.swing.*;
import java.awt.*;

public class Pr_11_03_02 extends JFrame
{
    public Pr_11_03_02()
    {
        setTitle("두 이미지 밑으로 나한히");
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
            g.drawImage(imgA, 0, 0, getWidth(), getHeight()/2, this);
            g.drawImage(imgB, 0, getHeight()/2, getWidth(), getHeight()/2, this);
        }
    }

    public static void main(String[] args)
    {
        new Pr_11_03_02();
    }
}
