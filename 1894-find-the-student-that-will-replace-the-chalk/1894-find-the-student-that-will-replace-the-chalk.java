class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int rem=k;
        while(rem>=0){
            for(int i=0;i<chalk.length;i++){
                k-=chalk[i];
                if(k<0){
                    return i;
                }
            }
        }
        return 0;

        

        
    }
}