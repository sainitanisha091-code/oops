class Solution {
    public static int maxSumRow(int[][] mat) {

        int max = 0;
        int index = 0;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;

            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }

            if (i == 0 || sum > max) {
                max = sum;
                index = i;
            }
        }

        return index;
    }
}
