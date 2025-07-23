class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    al.add(new ArrayList<>(List.of(i,j)));
                }
            }
        }
        TreeSet<Integer> row=new TreeSet<>();
        TreeSet<Integer> col=new TreeSet<>();

        for(ArrayList<Integer> ele: al){
            row.add(ele.get(0));
            col.add(ele.get(1));
        }
        for(Integer r:row){
            
                for(int j=0;j<matrix[0].length;j++){
                    matrix[r][j]=0;
                }
            
        }
        for(Integer c:col){
            
                for(int j=0;j<matrix.length;j++){
                    matrix[j][c]=0;
                
            }
        }

    }
}