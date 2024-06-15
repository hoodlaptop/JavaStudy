package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch_12_Assignment_03 extends JFrame {
    private Calendar c;
    private int hour, min, second;
    private JLabel time;
    private JLabel imageLabel;
    private JButton startButton, stopButton;
    private Thread clockThread;
    private boolean running = true;

    private int imageX = 10; // 이미지의 초기 X 위치
    private int imageY = 10; // 이미지의 Y 위치

    public  Ch_12_Assignment_03() {
        this.setTitle("디지털 시계");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());

        Container ct = getContentPane();
        ct.setLayout(null);

        // 시간 레이블 설정
        time = new JLabel();
        time.setFont(new Font("Arial", Font.ITALIC, 80));
        time.setBounds(35, 30, 400, 100);
        ct.add(time);

        // 이미지 레이블 설정
        imageLabel = new JLabel(new ImageIcon("OOP/images/apple.jpg")); // 이미지 경로를 실제 경로로 변경
        imageLabel.setBounds(imageX, imageY, 50, 50); // 크기 조정 필요시 변경
        ct.add(imageLabel);

        // 시작 버튼 설정
        startButton = new JButton("시작");
        startButton.setBounds(50, 130, 100, 30);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = true;
            }
        });
        ct.add(startButton);

        // 정지 버튼 설정
        stopButton = new JButton("정지");
        stopButton.setBounds(200, 130, 100, 30);
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });
        ct.add(stopButton);

        clockThread = new Thread(new ClockRunnable());
        clockThread.start();

        this.setSize(400, 200);
        this.setVisible(true);
    }

    private class ClockRunnable implements Runnable {
        public void run() {
            while (true) {
                if (running) {
                    // 시간을 업데이트
                    c = Calendar.getInstance();
                    hour = c.get(Calendar.HOUR_OF_DAY);
                    min = c.get(Calendar.MINUTE);
                    second = c.get(Calendar.SECOND);
                    String clockText = String.format("%02d:%02d:%02d", hour, min, second);
                    time.setText(clockText);

                    // 이미지를 이동
                    imageX += 10;
                    if (imageX > getWidth()) {
                        imageX = 10; // 왼쪽으로 초기화
                    }
                    imageLabel.setLocation(imageX, imageY);
                }

                try {
                    Thread.sleep(1000); // 1초 동안 대기
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Ch_12_Assignment_03();
    }
}
