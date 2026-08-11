public class spiral_matrix {
    static void printSpiral(int a[][], int r, int c) {
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                System.out.println(a[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(a[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.println(a[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(a[i][left]);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printSpiral(a, 3, 3);
    }
}