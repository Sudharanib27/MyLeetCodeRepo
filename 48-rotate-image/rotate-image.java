class Solution {
    public void rotate(int[][] matrix) {
        int temp = 0;
        // Transpose 2D matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse the elements rowwise
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j -1];
                matrix[i][matrix[0].length - j -1] = temp;
            }
        }
    }
}