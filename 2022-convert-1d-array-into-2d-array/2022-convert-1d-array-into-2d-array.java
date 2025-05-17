class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int length=original.length;
        int arr[][]=new int[m][n];
        if(m*n>length || m*n<length){
            int[][] empty= new int[0][];
            return empty;
        }
        else{
            int k=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=original[k];
                    k++;
                }
            }
            return arr;
        }
    }
}