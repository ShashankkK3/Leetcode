class Solution {
    public boolean isHappy(int n) {
       
        while(n>9){
            int sum=0;
            int copy=n;
            int digit=0;
            while(copy>0){
                digit=copy%10;
                sum+=(digit*digit);
                copy=copy/10;
            }
            n=sum;
            
        }
        if(n==1 || n==7){
                return true;
            }
        return false;
    }
}