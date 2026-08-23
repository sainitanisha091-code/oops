import java.util.Scanner;

public class classes_student_marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();

        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(id, name, marks);

        System.out.println("Total: " + s.calculateTotal());
        System.out.println("Average: " + s.calculateAverage());
        System.out.println("Above Average: " + s.countAboveAverage());
    }
}

class Student {

    private int studentId;
    private String name;
    private int[] marks;

    public Student(int studentId, String name, int[] marks) {

        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum;
    }

    public double calculateAverage() {

        return (double) calculateTotal() / marks.length;
    }

    public int countAboveAverage() {

        double average = calculateAverage();

        int count = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > average) {
                count++;
            }
        }

        return count;
    }
}
