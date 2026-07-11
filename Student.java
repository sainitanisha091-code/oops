class Student {
    String name;
    int rollNo;
    String course;

    Student() {
        System.out.println("Default Constructor Called");
    }

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Course   : " + course);
    }

    void study() {
        System.out.println(name + " is studying Java");
    }
}
 class Main {
    public static void main(String[] args) {
        Student mukesh = new Student();

        Student priya = new Student("Priya", 1350, "AI");
        priya.display();
        priya.study();
    }
}