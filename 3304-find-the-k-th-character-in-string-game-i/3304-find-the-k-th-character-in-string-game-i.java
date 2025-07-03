class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        StringBuilder sb2=new StringBuilder();
        while(sb.length()<k){
            for(int i=0;i<sb.length();i++){
                if((int)sb.charAt(i)==122){
                    sb2.append('a');
                }
                else{
                    sb2.append((char)(sb.charAt(i)+1));
                }
            }
            sb.append(sb2);
            sb2.setLength(0);
        }
        return sb.charAt(k-1);
    }
}