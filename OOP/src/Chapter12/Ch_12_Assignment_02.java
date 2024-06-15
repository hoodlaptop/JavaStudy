package Chapter12;

import java.awt.*;
import javax.swing.*;

class TimerThread_02 extends Thread
{
    private JLabel timerLabel;
    private boolean isIncrementing;

    public TimerThread_02(JLabel timerLabel, boolean isIncrementing)
    {
        this.timerLabel = timerLabel;
        this.isIncrementing = isIncrementing;
    }

    @Override
    public void run()
    {
        int n = 0;
        while (true)
        {
            synchronized (timerLabel)
            {
                if (isIncrementing)
                {
                    timerLabel.setText(Integer.toString(n));
                    n++;
                } else {
                    timerLabel.setText(Integer.toString(n));
                    n--;
                }
                try {
                    if (isIncrementing)
                    {
                        timerLabel.wait(1000);
                    }
                    else
                    {
                        timerLabel.wait(2000);
                    }
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}

public class Ch_12_Assignment_02 extends JFrame
{
    public Ch_12_Assignment_02()
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

        TimerThread_02 th1 = new TimerThread_02(timerLabelWest, true);
        TimerThread_02 th2 = new TimerThread_02(timerLabelEast, false);

        setSize(500, 200);
        setVisible(true);

        th1.start();
        th2.start();
    }

    public static void main(String[] args)
    {
        new Ch_12_Assignment_02();
    }
}
