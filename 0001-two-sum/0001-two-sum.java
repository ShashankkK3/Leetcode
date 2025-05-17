class Solution {
    public int[] twoSum(int[] nums, int target) {
        int copy[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            copy[i]=nums[i];
        }
        Arrays.sort(copy);
        int arr[]=new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            if(copy[i]+copy[j]==target){
                arr[0]=geti(copy[i],nums);
                arr[1]=getj(copy[j],nums,arr[0]);
                break;
            }
            else if(copy[i]+copy[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return arr;
    }
    public int geti(int val,int[] nums){
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val==nums[i])
            {
                ind=i;
                break;
            }
        }
        return ind;
    }
    public int getj(int val,int[] nums,int old){
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val==nums[i] && i!=old)
            {
                ind=i;
                break;
            }
        }
        return ind;
    }
}
