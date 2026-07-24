import java.util.Scanner;
public class first_ocur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(str.indexOf('a'));

        sc.close();
    }
}