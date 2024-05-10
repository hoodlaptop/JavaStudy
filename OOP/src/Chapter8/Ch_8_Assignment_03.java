package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Ch_8_Assignment_03 extends JFrame
{
    public Ch_8_Assignment_03()
    {
        setTitle("선택");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel message = new JLabel("좋아하는 과일을 모두 체크하세요!");
        message.setBounds(1, 1, 200, 20);
        container.add(message);

        JCheckBox apple = new JCheckBox("사 과");
        apple.setBounds(1, 50, 200, 20);
        container.add(apple);

        JCheckBox strawberry = new JCheckBox("딸 기");
        strawberry.setBounds(200, 50, 200, 20);
        container.add(strawberry);

        JCheckBox kiwi = new JCheckBox("키 위");
        kiwi.setBounds(1, 150, 200, 20);
        container.add(kiwi);

        JCheckBox grape = new JCheckBox("포 도");
        grape.setBounds(200, 150,200,20);
        container.add(grape);

        JButton select = new JButton("확인");
        select.setBounds(240, 220, 60, 30);
        container.add(select);

        JButton cancel = new JButton("취소");
        cancel.setBounds(320, 220, 60, 30);
        container.add(cancel);

        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Ch_8_Assignment_03();
    }
}
