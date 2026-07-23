import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value to be searched");
        int key = sc.nextInt(); // the value to be find
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                result = i;
                break;
            }
        }
        System.out.println("the value is at index " + result);
        sc.close();
    }

}
