class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int prev=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prev=nums[i];
            sum+=nums[i];
            if(sum<prev){
                sum=prev;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}