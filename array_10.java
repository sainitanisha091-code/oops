import java.util.Scanner;

public class array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter the value to be searched");
        int target = sc.nextInt();

        System.out.println("Enter the elements of array");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (target == arr[i][j]) {
                    System.out.println("Found at index [" + i + "][" + j + "]");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("Element not found");

        sc.close();
    }
}