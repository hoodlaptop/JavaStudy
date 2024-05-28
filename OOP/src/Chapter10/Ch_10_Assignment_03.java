package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch_10_Assignment_03 extends JFrame
{
    private JTextField tf = new JTextField(20);
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> imageList = new JList<>(listModel);
    private JLabel imgLabel = new JLabel();
    private String[] fruits = {"apple", "banana", "kiwi", "mango"};
    private ImageIcon[] images = {
            new ImageIcon("OOP/images/apple.jpg"),
            new ImageIcon("OOP/images/banana.jpg"),
            new ImageIcon("OOP/images/kiwi.jpg"),
            new ImageIcon("OOP/images/mango.jpg")};

    public Ch_10_Assignment_03()
    {
        setTitle("Ch_10_Assignment_03");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
        c.add(tf);

        JScrollPane scrollPane = new JScrollPane(imageList);
        scrollPane.setPreferredSize(new Dimension(120, 250));
        c.add(scrollPane);

        imgLabel.setText("이미지 출력");
        imgLabel.setPreferredSize(new Dimension(120, 250));
        c.add(imgLabel);

        tf.addKeyListener(new MyKeyListener());
        imageList.addMouseListener(new MyMouseListener());

        setSize(300, 350);
        setVisible(true);
    }

    private class MyKeyListener extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                String fruit = tf.getText();
                if (!fruit.isEmpty())
                {
                    listModel.addElement(fruit);
                    tf.setText("");
                }
            }
        }
    }

    private class MyMouseListener extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            String selectedFruit = imageList.getSelectedValue();
            boolean found = false;
            for (int i = 0; i < fruits.length; i++)
            {
                if (selectedFruit.equals(fruits[i]))
                {
                    imgLabel.setIcon(images[i]);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                imgLabel.setIcon(null);
                JOptionPane.showMessageDialog(getContentPane(), "이미지가 없습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args)
    {
        new Ch_10_Assignment_03();
    }
}
