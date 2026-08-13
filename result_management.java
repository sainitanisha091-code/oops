import java.util.*;
class Student{
    int rollNo ; 
    String name ; 
    int marks[];
    Student(int rollNo , String name , int [] marks){
        this.rollNo = rollNo; 
        this.name = name ; 
        this.marks = marks ; 
    }
    int total(){ 
        int sum = 0 ; 
        for (int x : marks) sum+=x ;
        return sum;
    }
    double average(){
       return total()/ (double) marks.length;
    }
    char grade(){
     double a =  average ();
     if (a>=90) return 'A';
     if (a>=75) return 'B';
     if (a>=60) return 'C';
     return 'F';
    }
       void display() {
        System.out.println(rollNo + " " + name);
        System.out.println("Total = " + total());
        System.out.println("Average = " + average());
        System.out.println("Grade = " + grade());
    }

}
public class result_management {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int rollNo = sc.nextInt();
    String name = sc.next();
    int marks[] = new int[5]; 
    for (int i = 0 ; i < 5 ; i++){
        marks[i] = sc.nextInt();
    }
    Student s = new Student(rollNo, name, marks);
    s.display();
    sc.close();
}
}
