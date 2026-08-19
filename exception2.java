import java.util.*;

public class exception2 {

    static void check(int age) throws ArithmeticException {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            check(age);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}