import java.util.Scanner;

public class array_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbeer of rows");
        int r = sc.nextInt();
        System.err.println("enter number of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int zero = 0;
        int one = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                } else {
                    if (arr[i][j] == 1) {
                        one++;
                    }
                }

            }
        }
        System.out.println("occupied seats:" + one);
        System.out.println("Empty seats:" + zero);

        sc.close();
    }
}
