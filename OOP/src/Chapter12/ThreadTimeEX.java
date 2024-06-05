package Chapter12;

import javax.swing.*;
import java.awt.*;

class TimerThread extends Thread
{
    private JLabel timerLable;

    public TimerThread(JLabel timerLable)
    {
        this.timerLable = timerLable;
    }

    @Override
    public void run()
    {
        int n = 0;
        while (true)
        {
            timerLable.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {return;}
        }
    }
}

public class ThreadTimeEX extends JFrame
{
    public ThreadTimeEX()
    {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLable = new JLabel();
        timerLable.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLable);

        TimerThread th = new TimerThread(timerLable);

        setSize(250, 150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimeEX();
    }
}