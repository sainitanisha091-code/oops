import java.util.Scanner;

public class Mainn {

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
        System.out.println("Second Maximum: " + s.secondMaxMarks());
    }
}

class Student {

    private int studentId;
    private String name;
    private int[] marks;

    public Student(int studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name= name;
        this.marks = marks;
        // Write your codethis

    }

    public int calculateTotal() {
        int sum = 0 ; 
        for (int i = 0 ; i<marks.length; i++){
            sum+= marks[i];
        }
        return sum;
       

    }

    public int secondMaxMarks() {
        int max = marks[0];
        int max2 = marks[0];
        for(int i = 0 ; i < marks.length; i++){
            if (marks[i]>max){
                max2 = max ; 
                max = marks[i];
            }    
            else if (marks[i]>max2 && marks[i]!=max){
                max2 = marks[i];
            }
                }   
                return max2;
                     

    }
}
