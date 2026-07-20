public class diagonal {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Primary diagonal: 1 5 9
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();

        // Secondary diagonal: 3 5 7
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == arr.length - 1 - i) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}