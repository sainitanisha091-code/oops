import java.util.Scanner;

class StringOperations {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverseString(str);

        System.out.println("Reversed string: " + result);

        sc.close();
    }
}