class Solution {
    public int countQuadruplets(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int d=k+1;d<nums.length;d++){
                        if(nums[d]==(nums[i]+nums[j]+nums[k])){
                            count++;
                        }
                    }
                }
            }

        }
        return count;
    }
}