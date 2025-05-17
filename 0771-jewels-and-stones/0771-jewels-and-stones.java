class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int arr[]=new int[26*2];
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(Character.isLowerCase(ch)){
                arr[ch-'a']++;
            }
            else{
                arr[ch-'A'+26]++;
            }
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(Character.isLowerCase(ch)){
                count+=arr[ch-'a'];
            }
            else{
                count+=arr[ch-'A'+26];
            }

        }
        return count;
    }
}