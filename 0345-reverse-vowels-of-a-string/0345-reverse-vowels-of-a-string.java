class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder demo=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                demo.append(s.charAt(i));
            }
        }
        
        StringBuilder str=demo.reverse();
        int k=0;
        for(int i=0;i<sb.length();i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i,str.charAt(k));
                k++;
            }
        }
        return sb.toString();

    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}