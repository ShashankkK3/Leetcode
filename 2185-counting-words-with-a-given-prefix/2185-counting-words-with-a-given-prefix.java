class Solution {
    public int prefixCount(String[] words, String pref) {
        int len=pref.length();
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=len){
                if(words[i].substring(0,len).equals(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}