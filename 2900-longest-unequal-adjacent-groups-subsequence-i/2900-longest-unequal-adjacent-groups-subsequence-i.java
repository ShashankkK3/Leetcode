class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> str = new ArrayList<String>();
        int previous = 2;
        for(int i = 0 ; i<groups.length ; i++){
            if(previous!=groups[i]){
                str.add(words[i]);
            }
            previous = groups[i];
        }
        return str;
        
    }
}