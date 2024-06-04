package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_11_06 extends JFrame
{
    public Pr_11_06()
    {
        setTitle("그래픽 이미지 10% 확대 축소");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(500, 500);
        setVisible(true);
    }

    private class MyPanel extends JPanel
    {
        private Image img = new ImageIcon("OOP/images/apple.jpg").getImage();
        private int x = img.getWidth(this), y = img.getHeight(this);

        public MyPanel()
        {
            this.addKeyListener(new KeyAdapter()
            {
                public void keyPressed(KeyEvent e)
                {
                    if(e.getKeyChar() == '+')
                    {
                        x = x + x/10;
                        y = y + y/10;
                    }
                    else if(e.getKeyChar() == '-')
                    {
                        x = x - x/10;
                        y = y - y/10;
                    }
                    repaint();
                }
            });

            this.setFocusable(true);
            this.requestFocus();
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.drawImage(img, 10, 10, x, y, this);
        }
    }

    public static void main(String[] args)
    {
        new Pr_11_06();
    }
}
