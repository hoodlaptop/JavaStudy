package Chapter12;

import java.awt.*;
import javax.swing.*;

class TimerThread_01 extends Thread
{
    private JLabel timerLabel;

    public TimerThread_01(JLabel timerLabel)
    {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run()
    {
        int n = 0;
        while (true)
        {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class Ch_12_Assignment_01 extends JFrame
{
    public Ch_12_Assignment_01()
    {
        setTitle("Ch_12_Assignment_01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JLabel timerLabelWest = new JLabel();
        timerLabelWest.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabelWest, BorderLayout.WEST);

        JLabel timerLabelEast = new JLabel();
        timerLabelEast.setFont(new Font("Gothic", Font.ITALIC, 80));
        timerLabelEast.setForeground(Color.BLUE);
        c.add(timerLabelEast, BorderLayout.EAST);

        TimerThread_01 th1 = new TimerThread_01(timerLabelWest);
        TimerThread_01 th2 = new TimerThread_01(timerLabelEast);

        setSize(500, 200);
        setVisible(true);

        th1.start();
        th2.start();
    }

    public static void main(String[] args)
    {
        new Ch_12_Assignment_01();
    }
}
