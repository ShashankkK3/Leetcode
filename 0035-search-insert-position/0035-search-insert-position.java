class Solution {
    public int searchInsert(int[] nums, int target) {
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        if(target>max){
            return (nums.length);
        }
        else if(target<min){
            return 0;
        }

        int low=0; int high=nums.length-1;
        while(low<=high){
            
            
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            
            }
            else if(nums[mid]>target){
                high=mid-1;
                if(nums[high]<target){
                    return high+1;
                }
            }
            else{
                low=mid+1;
                if(nums[low]>target ){
                    return low;
                }
            }
        }
        return 0;
    }
    
}