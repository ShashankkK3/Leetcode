class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vow=new int[words.length];
        int[] ans= new int[queries.length];
        int[] vowP=new int[words.length];
        for(int i=0;i<words.length;i++){
            if(isValid(words[i].charAt(0)) && isValid(words[i].charAt(words[i].length()-1))){
                vow[i]++;
            }
        }
        vowP[0]=vow[0];
        for(int i=1;i<words.length;i++){
            vowP[i]=vow[i]+vowP[i-1];

        }
        for(int i=0;i<queries.length;i++){
            if(queries[i][0]!=0){
                ans[i]=vowP[queries[i][1]]-vowP[queries[i][0]-1];

            }
            else{
                 ans[i]=vowP[queries[i][1]];
            }
            
        }
        return ans;
    }
    public boolean isValid(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}