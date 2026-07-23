import java.util.Scanner;

public class average_array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]arr = new int[n];
    for (int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
    }
    int average = 0; 
    int sum = 0;
    for (int i = 0 ;i < n ;i++){
        sum+= arr[i];
        average = sum/n;
    }
    System.out.println(average);

}
}
