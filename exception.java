import java.util.*;
public class exception {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a and b"); 
    int a = sc.nextInt(); 
    int b = sc.nextInt();
    try {
        int c = a/b;
        System.out.println(c);
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }
    finally{
        System.out.println("Program Completed");
    }


    }
}
