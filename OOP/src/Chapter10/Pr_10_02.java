package Chapter10;

import javax.swing.*;
import java.awt.*;

public class Pr_10_02 extends JFrame
{
    JMenuBar menuBar = new JMenuBar();

    public Pr_10_02()
    {
        setTitle("메뉴 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        String[] sMenu = {"파일", "편집", "보기", "입력"};
        JMenu[] menu = new JMenu[sMenu.length];
        for (int i = 0; i < sMenu.length; i++)
        {
            menu[i] = new JMenu(sMenu[i]);
            menuBar.add(menu[i]);
        }

        String[] scrItem = {"화면확대", "쪽윤곽"};
        JMenuItem[] item = new JMenuItem[scrItem.length];
        for (int i = 0; i < item.length; i++)
        {
            item[i] = new JMenuItem(scrItem[i]);
            menu[2].addSeparator();
            menu[2].add(item[i]);
        }

        this.setJMenuBar(menuBar);

        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pr_10_02();
    }
}
