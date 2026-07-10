import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = sc.nextInt();
        System.out.print("age is " + age);
        sc.close();
    }
}

