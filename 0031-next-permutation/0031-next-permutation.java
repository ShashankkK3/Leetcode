class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=ind+1;i<n;i++){
            al.add(nums[i]);
        }
        Collections.reverse(al);
        int j=0;
        
        for(int i=ind+1;i<n;i++){
            nums[i]=al.get(j);
            j++;
        

        }
    }
}