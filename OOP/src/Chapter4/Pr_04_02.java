package Chapter4;

import java.util.Scanner;

public class Pr_04_02
{
    public static class Phone
    {
        private String name, tel;
        public Phone(String name, String tel)
        {
            this.name = name;
            this.tel = tel;
        }

        public String getName() {return name;}
        public String getTel() {return tel;}
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name and phone >>");
        Phone p1 = new Phone(scanner.nextLine(), scanner.nextLine());
        Phone p2 = new Phone(scanner.nextLine(), scanner.nextLine());

        System.out.println(p1.getName() + " " + p1.getTel());
        System.out.println(p2.getName() + " " + p2.getTel());

        scanner.close();
    }
}
