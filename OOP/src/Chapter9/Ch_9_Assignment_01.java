package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ch_9_Assignment_01 extends JFrame
{
    private JLabel first, second, third, sameText;
    private JButton start, reset;

    public Ch_9_Assignment_01()
    {
        setTitle("Ch_9_Assignment_01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        first = new JLabel("0",SwingConstants.CENTER);
        second = new JLabel("0",SwingConstants.CENTER);
        third = new JLabel("0",SwingConstants.CENTER);
        sameText = new JLabel("시작합니다.",SwingConstants.CENTER);

        first.setBackground(Color.PINK);
        first.setSize(100,50);
        first.setLocation(40,100);
        first.setFont(new Font("Arial",Font.PLAIN,30));
        first.setOpaque(true);

        second.setBackground(Color.PINK);
        second.setSize(100,50);
        second.setLocation(180,100);
        second.setFont(new Font("Arial",Font.PLAIN,30));
        second.setOpaque(true);

        third.setBackground(Color.PINK);
        third.setSize(100,50);
        third.setLocation(320,100);
        third.setFont(new Font("Arial",Font.PLAIN,30));
        third.setOpaque(true);

        sameText.setSize(300,50);
        sameText.setLocation(80,170);

        start = new JButton("Start");
        start.setSize(80, 50);
        start.setLocation(100,200);
        start.addActionListener(new MyActionListener());

        reset = new JButton("Reset");
        reset.setSize(80, 50);
        reset.setLocation(280,200);
        reset.addActionListener(new MyActionListener());

        add(first);
        add(second);
        add(third);
        add(sameText);
        add(start);
        add(reset);

        setSize(500, 500);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == start)
            {
                JButton start = (JButton) e.getSource();

                first.setText((int)(Math.random()*5)+"");
                first.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
                second.setText((int)(Math.random()*5)+"");
                second.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
                third.setText((int)(Math.random()*5)+"");
                third.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
                if(first.getText().equals(second.getText()))
                {
                    if(second.getText().equals(third.getText()))
                        sameText.setText("축하합니다.");
                    else
                        sameText.setText("아쉽군요");
                }
                else
                    sameText.setText("아쉽군요");
            }
            else
            {
                first.setText("0");
                second.setText("0");
                third.setText("0");
                first.setBackground(Color.PINK);
                second.setBackground(Color.PINK);
                third.setBackground(Color.PINK);
            }
        }
    }


    public static void main(String[] args)
    {
        new Ch_9_Assignment_01();
    }
}
