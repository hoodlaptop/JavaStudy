package Chapter5;

    class Person
    {
        private String talk;
        private String eat;
        private String walk;
        private String sleep;

        public Person(String talk, String eat, String walk, String sleep)
        {
            this.talk = talk;
            this.eat = eat;
            this.walk = walk;
            this.sleep = sleep;
        }

        public void describe()
        {
            System.out.println("Talk: " + talk);
            System.out.println("Eat: " + eat);
            System.out.println("Walk: " + walk);
            System.out.println("Sleep: " + sleep);
        }
    }

    class Student extends Person
    {
        private String study;
        private String project;

        public Student(String talk, String eat, String walk,
                       String sleep, String study, String project)
        {
            super(talk, eat, walk, sleep);
            this.study = study;
            this.project = project;
        }

        @Override //애노테이션(Annotation) - 재정의된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러발생
        public void describe()
        {
            super.describe();
            System.out.println("Study: " + study);
            System.out.println("Project: " + project);
        }
    }

    class StudentWorker extends Student
    {
        private String work;
        private String mindOthers;

        public StudentWorker(String talk, String eat, String walk, String sleep,
                             String study, String project, String work, String mindOthers)
        {
            super(talk, eat, walk, sleep, study, project);
            this.work = work;
            this.mindOthers = mindOthers;
        }

        @Override
        public void describe()
        {
            super.describe();
            System.out.println("Work: " + work);
            System.out.println("Mind others: " + mindOthers);
        }
    }

    class Researcher extends Person
    {
        private String research;
        private String test;

        public Researcher(String talk, String eat, String walk,
                          String sleep, String research, String test)
        {
            super(talk, eat, walk, sleep);
            this.research = research;
            this.test = test;
        }

        @Override
        public void describe()
        {
            super.describe();
            System.out.println("Research: " + research);
            System.out.println("Test: " + test);
        }
    }

    class Professor extends Researcher
    {
        private String teach;
        private String presentQuestion;

        public Professor(String talk, String eat, String walk, String sleep,
                         String research, String test, String teach, String presentQuestion)
        {
            super(talk, eat, walk, sleep, research, test);
            this.teach = teach;
            this.presentQuestion = presentQuestion;
        }

        @Override
        public void describe()
        {
            super.describe();
            System.out.println("Teach: " + teach);
            System.out.println("Present question: " + presentQuestion);
        }
    }

public class Ch_5_Assignment_02
{
    public static void main(String[] args)
    {
        // Person 객체 생성
        Person person = new Person("말하기", "먹기", "걷기", "잠자기");
        System.out.println("Person:");
        person.describe();
        System.out.println();

        // Student 객체 생성
        Student student = new Student("말하기", "먹기", "걷기", "잠자기", "공부하기", "프로젝트하기");
        System.out.println("Student:");
        student.describe();
        System.out.println();

        // StudentWorker 객체 생성
        StudentWorker studentWorker = new StudentWorker("말하기", "먹기", "걷기", "잠자기",
                "공부하기", "프로젝트하기", "일하기", "눈치보기");
        System.out.println("StudentWorker:");
        studentWorker.describe();
        System.out.println();

        // Researcher 객체 생성
        Researcher researcher = new Researcher("말하기", "먹기", "걷기", "잠자기",
                "연구하기", "테스트하기");
        System.out.println("Researcher:");
        researcher.describe();
        System.out.println();

        // Professor 객체 생성
        Professor professor = new Professor("말하기", "먹기", "걷기", "잠자기",
                "연구하기", "테스트하기", "가르치기", "문제내기");
        System.out.println("Professor:");
        professor.describe();
    }
}
