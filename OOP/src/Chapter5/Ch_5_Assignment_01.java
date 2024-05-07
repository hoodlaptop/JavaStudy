package Chapter5;

import java.util.Scanner;

abstract class Calculator
{
    protected int a,b;
    abstract protected int calc();
    protected void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void run()
    {
        input();
        int res = calc();
        System.out.println("계산된 값은 " + res);
    }
}

class Adder extends Calculator
{
    @Override
    //애노테이션(Annotation) - 재정의된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러발생
    protected int calc() {
        return a + b;
    }
}

class Subtracter extends Calculator
{
    @Override
    protected int calc() {
        return a - b;
    }
}

class Multiplier extends Calculator {
    @Override
    protected int calc() {
        return a * b;
    }
}

class Divider extends Calculator {
    @Override
    protected int calc()
    {
        if (b != 0)
        {
            return a / b;
        }
        else
        {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
    }
}

public class Ch_5_Assignment_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산을 선택하세요 (+, -, *, /)>>");
        char operation = scanner.next().charAt(0);

        Calculator calculator;

        switch (operation)
        {
            case '+':
                Adder adder = new Adder();
                adder.run();
                break;
            case '-':
                Subtracter sub = new Subtracter();
                sub.run();
                break;
            case '*':
                Multiplier multi = new Multiplier();
                multi.run();
                break;
            case '/':
                Divider div = new Divider();
                div.run();
                break;
            default:
                System.out.println("올바른 연산자를 선택해주세요.");
                return;
        }
    }
}
