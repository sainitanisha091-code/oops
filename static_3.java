 class Student_3 {
    int rollNo; 
   static String name = "Tanisha"; 
    String course; 
    static String college = "chitkara";

    static void greet(){
        System.out.println("Good Morning  "+name);
    }
}

public class static_3 {
    public static void main(String[] args) {
         Student_3.greet();
    }
   
}