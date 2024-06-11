package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch_11_Assignment_01 extends JFrame
{
    private MyPanel panel = new MyPanel();
    private Image img = null; // 초기화할 때 이미지를 null로 설정
    private int imgWidth, imgHeight;
    private Color circleColor = Color.BLUE; // 초기 원 색상 설정
    private Point start = null, end = null;
    private boolean drawPrimary3 = false;
    private boolean drawPrimary4 = false;

    public Ch_11_Assignment_01() {
        setTitle("Assignment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenu();
        getContentPane().add(panel);

        setSize(500, 500);
        setVisible(true);
    }

    private void createMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu imageMenu = new JMenu("Image Change");
        JMenu drawCircleMenu = new JMenu("Draw Circle Mouse");
        JMenu changeColorMenu = new JMenu("Change Color");
        JMenu circleDivideMenu = new JMenu("Circle Divide");

        JMenuItem loadItem = new JMenuItem("Image Load");
        JMenuItem shrinkItem = new JMenuItem("Shrink Image(-10%)");
        JMenuItem enlargeItem = new JMenuItem("Image Enlargement(+10%)");
        JMenuItem clearItem = new JMenuItem("Clear");

        JMenuItem redItem = new JMenuItem("RED");
        JMenuItem blueItem = new JMenuItem("BLUE");
        JMenuItem yellowItem = new JMenuItem("YELLOW");

        JMenuItem primaryColors3Item = new JMenuItem("3 Primary Colors");
        JMenuItem primaryColors4Item = new JMenuItem("4 Primary Colors");

        loadItem.addActionListener(new MenuActionListener());
        shrinkItem.addActionListener(new MenuActionListener());
        enlargeItem.addActionListener(new MenuActionListener());
        clearItem.addActionListener(new MenuActionListener());

        redItem.addActionListener(new MenuActionListener());
        blueItem.addActionListener(new MenuActionListener());
        yellowItem.addActionListener(new MenuActionListener());

        primaryColors3Item.addActionListener(new MenuActionListener());
        primaryColors4Item.addActionListener(new MenuActionListener());

        imageMenu.add(loadItem);
        imageMenu.add(shrinkItem);
        imageMenu.add(enlargeItem);

        changeColorMenu.add(redItem);
        changeColorMenu.add(blueItem);
        changeColorMenu.add(yellowItem);

        drawCircleMenu.add(changeColorMenu);
        drawCircleMenu.add(clearItem);

        circleDivideMenu.add(primaryColors3Item);
        circleDivideMenu.add(primaryColors4Item);

        menuBar.add(imageMenu);
        menuBar.add(drawCircleMenu);
        menuBar.add(circleDivideMenu);

        setJMenuBar(menuBar);
    }

    private class MenuActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command)
            {
                case "Image Load":
                    img = new ImageIcon("OOP/images/apple.jpg").getImage();
                    imgWidth = img.getWidth(panel);
                    imgHeight = img.getHeight(panel);
                    panel.repaint();
                    break;
                case "Shrink Image(-10%)":
                    if (img != null) {
                        imgWidth = imgWidth - imgWidth / 10;
                        imgHeight = imgHeight - imgHeight / 10;
                        panel.repaint();
                    }
                    break;
                case "Image Enlargement(+10%)":
                    if (img != null) {
                        imgWidth = imgWidth + imgWidth / 10;
                        imgHeight = imgHeight + imgHeight / 10;
                        panel.repaint();
                    }
                    break;
                case "RED":
                    circleColor = Color.RED;
                    break;
                case "BLUE":
                    circleColor = Color.BLUE;
                    break;
                case "YELLOW":
                    circleColor = Color.YELLOW;
                    break;
                case "Clear":
                    start = null;
                    end = null;
                    img = null;
                    drawPrimary3 = false;
                    drawPrimary4 = false;
                    panel.repaint();
                    break;
                case "3 Primary Colors":
                    drawPrimary3 = true;
                    drawPrimary4 = false;
                    panel.repaint();
                    break;
                case "4 Primary Colors":
                    drawPrimary3 = false;
                    drawPrimary4 = true;
                    panel.repaint();
                    break;
            }
        }
    }

    private class MyPanel extends JPanel
    {
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            if (img != null)
            {
                g.drawImage(img, 10, 10, imgWidth, imgHeight, this);
            }
            if (start != null && end != null)
            {
                g.setColor(circleColor);
                int x = Math.min(start.x, end.x);
                int y = Math.min(start.y, end.y);
                int width = Math.abs(start.x - end.x);
                int height = Math.abs(start.y - end.y);
                g.drawOval(x, y, width, height);
            }
            if (drawPrimary3)
            {
                drawDividedCircle(g, 3);
            }
            if (drawPrimary4)
            {
                drawDividedCircle(g, 4);
            }
        }

        private void drawDividedCircle(Graphics g, int sections)
        {
            int diameter = 100;
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;
            for (int i = 0; i < sections; i++)
            {
                g.setColor(getColorForIndex(i, sections));
                g.fillArc(x, y, diameter, diameter, i * 360 / sections, 360 / sections);
            }
        }

        private Color getColorForIndex(int index, int total)
        {
            switch (index)
            {
                case 0: return Color.RED;
                case 1: return Color.YELLOW;
                case 2: return Color.BLUE;
                case 3: return Color.GREEN;
                default: return Color.BLACK;
            }
        }
    }

    private class MyMouseListener extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            start = e.getPoint();
        }

        @Override
        public void mouseDragged(MouseEvent e)
        {
            end = e.getPoint();
            panel.repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            end = e.getPoint();
            panel.repaint();
        }
    }

    public static void main(String[] args)
    {
        Ch_11_Assignment_01 frame = new Ch_11_Assignment_01();
        frame.panel.addMouseListener(frame.new MyMouseListener());
        frame.panel.addMouseMotionListener(frame.new MyMouseListener());
    }
}
