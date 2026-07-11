class Student_2 {
     String name; 
     int rollNo; 
     String course; 
     static String college = "chitkara university";
}
public class static_2 {
    public static void main(String[] args) {
        Student_2 mukesh = new Student_2();
        mukesh.name = "Mukesh";
        mukesh.rollNo= 123654;
        mukesh.course = "AI";
        mukesh.college = "Cu";
        System.out.println(Student_2.college);
 
        Student_2 sukesh = new Student_2();
        sukesh.name = "Sukesh";
        sukesh.rollNo = 789654;
        sukesh.course = "Ml";
        sukesh.college = "LPU";

        System.out.println(Student_2.college);
    }
}
