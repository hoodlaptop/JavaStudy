package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch_10_Assignment_01 extends JFrame
{
    private JLabel imgLabel = new JLabel();

    public Ch_10_Assignment_01()
    {
        setTitle("Ch_10_Assignment_01");
        createMenu();
        add(imgLabel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 200);
        setVisible(true);
    }

    private void createMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenuItem[] menuItems = new JMenuItem[5];
        String[] itemNames = {"Load", "Change", "Hide", "ReShow", "Exit"};
        JMenu screenMenu = new JMenu("Screen");

        MenuActionListener listener = new MenuActionListener();
        for (int i = 0; i < menuItems.length; i++)
        {
            menuItems[i] = new JMenuItem(itemNames[i]);
            menuItems[i].addActionListener(listener);
            screenMenu.add(menuItems[i]);
        }
        menuBar.add(screenMenu);
        setJMenuBar(menuBar);
    }

    private class MenuActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            switch (command)
            {
                case "Load":
                    imgLabel.setIcon(new ImageIcon("OOP/images/img.jpg"));
                    break;
                case "Change":
                    String input = JOptionPane.showInputDialog(
                            Ch_10_Assignment_01.this,
                            "경로를 입력하세요"
                    );
                    imgLabel.setIcon(new ImageIcon(input));
                    break;
                case "Hide":
                    imgLabel.setVisible(false);
                    break;
                case "ReShow":
                    imgLabel.setVisible(true);
                    break;
                case "Exit":
                    int response = JOptionPane.showConfirmDialog(
                            Ch_10_Assignment_01.this,
                            "Are you sure you want to exit?",
                            "Exit Confirmation",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );
                    if (response == JOptionPane.YES_OPTION)
                        System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        new Ch_10_Assignment_01();
    }
}
