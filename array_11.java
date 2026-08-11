import java.util.Scanner;
public class array_11 {
    static int row_sum(int[][]arr , int r){
        int sum = 0 ;
        for (int j = 0 ; j <arr.length ; j++){
            sum+= arr[r][j];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int arr[][] = new int[r][c]; 
        System.out.println("Enter the elements of the matrix");
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxsum = row_sum(arr,0);
        int max_row = 0 ;
        for (int i = 1 ; i < r; i++){
            int sum = row_sum(arr, i);
            if(sum>maxsum){
                maxsum = sum;
                max_row = i;
            }
        }
        System.out.println(max_row+" "+ maxsum);

        sc.close();
    }
}
