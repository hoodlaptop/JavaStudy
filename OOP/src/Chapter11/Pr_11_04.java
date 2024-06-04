package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_11_04 extends JFrame
{
    public Pr_11_04()
    {
        setTitle("이미지 위에 원 드래그");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel
    {
        private Point p = null;
        public MyPanel()
        {
            addMouseMotionListener(new MouseMotionListener()
            {
                public void mouseDragged(MouseEvent e)
                {
                    p = e.getPoint();
                    repaint();
                }
                public void mouseMoved(MouseEvent e) {}
            });
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Image img = new ImageIcon("OOP/images/b.jpg").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            g.setColor(Color.GREEN);

            if(p == null) return;
            g.fillOval(p.x, p.y, 20, 20);

        }
    }

    public static void main(String[] args)
    {
        new Pr_11_04();
    }
}
