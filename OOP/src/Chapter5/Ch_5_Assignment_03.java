package Chapter5;

import java.awt.*;

class Line
{
    private int startX, startY;
    private int endX, endY;

    public Line(int startX, int startY, int endX, int endY)
    {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public int getStartX() { return startX; }
    public int getStartY() { return startY; }
    public int getEndX() { return endX; }
    public int getEndY() { return endY; }

    public void drawLine()
    {
        System.out.println("시작점: (" + startX + ", " + startY + "), 끝점: (" + endX + ", " + endY + ")");
    }

    public void deleteLine()
    {
        startX = 0;
        startY = 0;
        endX = 0;
        endY = 0;
        System.out.println("선을 삭제합니다.");
    }

}

class LineEx extends Line
{
    private String color;
    private int thickness;

    public LineEx(int startX, int startY, int endX, int endY,
                  String color, int thickness)
    {
        super(startX, startY, endX, endY);
        this.color = color;
        this.thickness = thickness;
    }

    public void showLine() {
        System.out.println("시작점(" + getStartX() + ", " + getStartY() + "), 끝점("
                + getEndX() + ", " + getEndY() + "), 선색: " + color + ", 선굵기: " + thickness);
    }
}

public class Ch_5_Assignment_03
{
    public static void main(String[] args)
    {
        LineEx line = new LineEx(1, 2, 5, 6, "Red", 2);

        line.showLine();
    }
}
