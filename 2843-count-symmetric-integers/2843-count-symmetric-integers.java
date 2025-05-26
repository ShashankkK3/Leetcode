class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
         for(int i=low;i<=high;i++){
            
                String num=Integer.toString(i);
                int len=num.length();
                if(len%2!=0){
                    continue;
                }
                int mid=len/2;
                int lsum=0,rsum=0;
                for(int j=0;j<mid;j++){
                    lsum+=num.charAt(j)-'0';
                    rsum+=num.charAt(mid+j)-'0';
                }
                if(lsum==rsum)
                   count++;
        }
        return count;
    }
}