import java.util.Scanner;

public class array_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the value to be searched");
        int target = sc.nextInt();
        System.out.println("enter the elements of array");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int found = 0 ;
        for (int i = 0; i < 10; i++) {
            if (target == arr[i]) {
                 found = i ;
                break;
            } 
        }
        System.out.println("found at index " + found);
        sc.close();
    }
}
