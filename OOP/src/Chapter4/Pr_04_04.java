package Chapter4;

import java.util.Scanner;

public class Pr_04_04
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
        Phone[] phones;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people>>");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        phones = new Phone[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++)
        {
            System.out.print("Enter name and phone number");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String name = tokens[0];
            String tel = tokens[1];
            phones[i] = new Phone(name, tel);
        }
        System.out.println("Save...");

        while (true)
        {
            System.out.print("Name to search>>");
            String name = scanner.nextLine();

            if (name.equals("exit"))
            {
                System.out.println("exit");
                break;
            }

            boolean found = false;
            for (int i = 0; i < numberOfPeople; i++)
            {
                if (phones[i].getName().equals(name))
                {
                    System.out.println(phones[i].getName() + " number is " + phones[i].getTel());
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("Not found");
        }
        scanner.close();
    }
}
