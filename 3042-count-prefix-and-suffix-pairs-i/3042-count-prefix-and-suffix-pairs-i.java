class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){

                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }


            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String str1,String str2){
        int len=str1.length();
        int len2=str2.length();
        if(len>len2){
            return false;
        }
        if(str1.equals(str2.substring(0,len)) && str1.equals(str2.substring(len2-len,len2))){
            return true;
        }
        return false;

    }
}