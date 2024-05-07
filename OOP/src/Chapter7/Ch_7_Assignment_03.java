package Chapter7;

import java.util.*;

public class Ch_7_Assignment_03
{
    static class Student
    {
        private String Id, name;
        private int attendance, assignment, midtermEx, finalEx;
        private double totalScore;
        private char grade;

        public Student(String Id, String name, int attendance, int assignment, int midtermEx, int finalEx)
        {
            this.Id = Id;
            this.name = name;
            this.attendance = attendance;
            this.assignment = assignment;
            this.midtermEx = midtermEx;
            this.finalEx = finalEx;
        }

        public String getId() {return Id;} public String getName() {return name;}
        public int getAttendance() {return attendance;} public int getAssignment() {return assignment;}
        public int getMidtermEx() {return midtermEx;} public int getFinalEx() {return finalEx;}
        public double getTotalScore() {return totalScore;}
        public char getGrade() {return grade;}

        public void setTotalScore(double totalScore)
        {
            this.totalScore = totalScore;
        }
        public void setGrade(char grade)
        {
            this.grade = grade;
        }

    }

    static class ScoreManager
    {
        private ArrayList<Student> SManager;

        public ScoreManager()
        {
            SManager = new ArrayList<>();
        }

        public void TotalScore()
        {
            for (Student student : SManager)
            {
                double total = student.getAttendance() * 0.1 + student.getAssignment() * 0.3 +
                        student.getMidtermEx() * 0.3 + student.getFinalEx() * 0.3;
                student.setTotalScore(total);
            }
        }

        private void Grade()
        {
            for (Student student : SManager)
            {
                double totalScore = student.getTotalScore();
                char grade;
                if (totalScore >= 90)
                {
                    grade = 'A';
                }
                else if (totalScore >= 80)
                {
                    grade = 'B';
                }
                else if (totalScore >= 70)
                {
                    grade = 'C';
                }
                else if (totalScore >= 60)
                {
                    grade = 'D';
                }
                else
                {
                    grade = 'F';
                }
                student.setGrade(grade);
            }
        }

        public void addStudent(Student student)
        {
            SManager.add(student);
        }
        public void deleteStudent(String sId)
        {
            Iterator<Student> iterator = SManager.iterator();
            while (iterator.hasNext())
            {
                Student student = iterator.next();
                if (student.getId().equals(sId))
                {
                    iterator.remove();
                    System.out.println("학번 " + sId + "의 학생 정보가 삭제되었습니다.");
                    return;
                }
            }
            System.out.println("해당 학번을 가진 학생이 없습니다.");
        }

        public void inquiry(String sId)
        {
            Iterator<Student> iterator = SManager.iterator();
            while (iterator.hasNext())
            {
                Student student = iterator.next();
                if (student.getId().equals(sId))
                {
                    System.out.println("학번: " + student.getId());
                    System.out.println("이름: " + student.getName());
                    System.out.println("출석점수: " + student.getAttendance());
                    System.out.println("과제점수: " + student.getAssignment());
                    System.out.println("중간고사 점수: " + student.getMidtermEx());
                    System.out.println("기말고사 점수: " + student.getFinalEx());
                    System.out.println("총점: " + student.getTotalScore());
                    System.out.println("학점:" + student.getGrade());
                    System.out.println();
                }
                else if (!(student.getId().equals(sId)))
                {
                    System.out.println("찾을 수 없습니다.");
                }
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ScoreManager scoreManager = new ScoreManager();

        boolean run = true;
        while (run)
        {
            System.out.print("성적 입력(1), 성적 조회(2), 성적 삭제(3), 종료(4) >> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("학번: ");
                    String Id = scanner.nextLine();
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("출석점수: ");
                    int attendance = scanner.nextInt();
                    System.out.print("과제점수: ");
                    int assignment = scanner.nextInt();
                    System.out.print("중간고사 점수: ");
                    int midtermEx = scanner.nextInt();
                    System.out.print("기말고사 점수: ");
                    int finalEx = scanner.nextInt();

                    Student student = new Student(Id, name, attendance, assignment, midtermEx, finalEx);
                    scoreManager.addStudent(student);
                    scoreManager.TotalScore();
                    scoreManager.Grade();
                    break;
                case 2:
                    System.out.println("학번 입력>>");
                    String sId = scanner.next();
                    scoreManager.inquiry(sId);
                    break;
                case 3:
                    System.out.println("학번 입력>>");
                    String sIdR = scanner.next();
                    scoreManager.deleteStudent(sIdR);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
            }
        }

    }
}
