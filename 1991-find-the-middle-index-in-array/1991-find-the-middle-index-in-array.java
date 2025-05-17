class Solution {
    public int findMiddleIndex(int[] nums) {
        int p[] = new int[nums.length];
        int c=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                p[i]=nums[i];
            }
            else{
                p[i]=p[i-1]+nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(p[nums.length-1] - p[i]==0)
                {
                   return i;
                   
                   
                }
            }
            else if(i!=(nums.length-1)){
                if(p[i-1]==(p[nums.length-1]-p[i]))
                {
                    return i;
                }
            }
            else{
                if(p[nums.length-2]==0)
                {
                    return i;
                }

            }
        }
        return -1;

        
        
    }
}