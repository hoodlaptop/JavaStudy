package Chapter4;

import java.util.Scanner;

class Person
{
    private String name, job, age, gender, bloodType;

    // 생성자
    public Person(String name, String job, String age, String gender, String bloodType)
    {
        this.name = name;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.bloodType = bloodType;
    }

    // 정보 출력
    public String toString()
    {
        return "이름: " + name + "\n" +
                "직업: " + job + "\n" +
                "나이: " + age + "\n" +
                "성별: " + gender + "\n" +
                "혈액형: " + bloodType + "\n";
    }
}
public class Ch_4_Assignment_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // 인원수 입력
        System.out.print("인원수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Person[] people = new Person[count];

        // 인원수만큼 정보 입력 받기
        for (int i = 0; i < count; i++)
        {
            System.out.println("\n사람 정보를 입력하세요 (Person " + (i + 1) + "):");
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("직업: ");
            String job = scanner.nextLine();
            System.out.print("나이: ");
            String age = scanner.nextLine();
            System.out.print("성별: ");
            String gender = scanner.nextLine();
            System.out.print("혈액형: ");
            String bloodType = scanner.nextLine();

            // Person 객체 생성
            people[i] = new Person(name, job, age, gender, bloodType);
        }

        // 입력된 사람 정보 출력
        System.out.println("\n입력된 사람 정보:");
        for (int i = 0; i < count; i++)
        {
            System.out.println("\nPerson " + (i + 1) + ":\n" + people[i]);
        }

        scanner.close();
    }
}
