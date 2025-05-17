class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;  // Get Size of Row
        int m = matrix[0].length;  // Get Size of Column
        int[][] past = new int[m][n];  // Switch
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                past[j][i] = matrix[i][j];
            }
        }
        return past;
    }
}