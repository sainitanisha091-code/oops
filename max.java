import java.util.Scanner;

public class max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Max = 0 ; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>Max){
                Max= arr[i];
            }
        }
        System.out.print(Max);
        sc.close();
    }
}
