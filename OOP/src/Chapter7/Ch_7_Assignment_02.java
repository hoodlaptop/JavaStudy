package Chapter7;

import java.util.*;

public class Ch_7_Assignment_02
{
    static class Customer
    {
        private String name;
        private int points;

        public Customer(String name, int points)
        {
            this.name = name;
            this.points = points;
        }
        public String getName()
        {
            return name;
        }
        public int getPoints()
        {
            return points;
        }

    }

    static class CustomerManager
    {
        private HashMap<String, Customer> C_Point;

        public CustomerManager()
        {
            C_Point = new HashMap<>();
        }

        public void addCustomer(String phone, Customer customer)
        {
            C_Point.put(phone, customer);
        }

        public void inquiry(String phone)
        {
            Customer customer = C_Point.get(phone);

            if (customer != null)
                System.out.println("고객 정보 - 이름: " + customer.getName() +
                        ", 전화번호: " + phone + ", 포인트: " + customer.getPoints());
            else
                System.out.println("해당 전화번호로 등록된 고객 정보가 없습니다.");
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();

        boolean run = true;

        while (run)
        {
            System.out.println("메뉴를 선택해주세요");
            System.out.println("-고객 정보 입력(1)");
            System.out.println("-고객 정보 조회(2)");
            System.out.println("-종료(3)");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("이름 입력>>");
                    String name = scanner.next();
                    System.out.print("전화번호 입력>>");
                    String phone = scanner.next();
                    System.out.print("포인트 입력>>");
                    int point = scanner.nextInt();

                    Customer customer = new Customer(name, point);
                    customerManager.addCustomer(phone, customer);
                    break;
                case 2:
                    System.out.println("전화번호 입력");
                    String searchPhone = scanner.next();
                    customerManager.inquiry(searchPhone);
                    break;
                case 3:
                    System.out.println("종료합니다");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }

    }
}
