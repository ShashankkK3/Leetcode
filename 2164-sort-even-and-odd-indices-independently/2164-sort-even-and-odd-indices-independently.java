class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        odd.sort(Comparator.reverseOrder());
        even.sort(null);
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(j);
                j++;
            }
            else{
                nums[i]=odd.get(k);
                k++;
            }
        }
        return nums;

        

    }
}