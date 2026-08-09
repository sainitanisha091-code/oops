import java.util.Scanner;
public class array_6{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows");
    int r = sc.nextInt();
    System.out.println("enter the number of colummns");
    int c = sc.nextInt();
    int [][] arr = new int[r][c];
    for (int i = 0 ; i <  r ; i++){
        for (int j = 0 ; j < c ; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("your matrix  is: ");
    for (int i = 0 ; i <  r ; i++){
        for (int j = 0 ; j < c ; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    sc.close();
}   
}