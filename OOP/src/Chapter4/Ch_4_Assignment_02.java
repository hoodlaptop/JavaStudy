package Chapter4;

import java.util.Scanner;

class Dog {
    private String name, breed, age, color;

    // 생성자
    public Dog(String name, String breed, String age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public String getAge() { return age; }
    public String getColor() { return color; }
}

public class Ch_4_Assignment_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // 개의 수 입력
        System.out.print("몇마리의 개인가요? >> ");
        int count = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 개 배열 생성
        Dog[] dogs = new Dog[count];

        // 개의 정보 입력
        for (int i = 0; i < count; i++)
        {
            System.out.println("\n개(Dog) " + (i + 1) + " 정보를 입력해주세요 >> ");
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("견종: ");
            String breed = scanner.nextLine();
            System.out.print("나이: ");
            String age = scanner.nextLine();
            System.out.print("색상: ");
            String color = scanner.nextLine();

            // Dog 객체 생성
            dogs[i] = new Dog(name, breed, age, color);
        }

        // 입력된 개 정보 출력
        System.out.println("\n입력된 개 정보:");
        for (int i = 0; i < count; i++) {
            System.out.println("\nDog " + (i + 1) + ":");
            System.out.println("이름: " + dogs[i].getName());
            System.out.println("견종: " + dogs[i].getBreed());
            System.out.println("나이: " + dogs[i].getAge());
            System.out.println("색상: " + dogs[i].getColor());
        }

        scanner.close();
    }
}
