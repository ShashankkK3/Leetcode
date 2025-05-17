class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i+=2*k){
            if(s.length()-(i)<k){
                a.append(s.substring(i));
                a.reverse();
                sb.replace(i,s.length(),a.toString());
                break;
            }
            for(int j=i;j<i+k && j<s.length();j++){
                a.append(s.charAt(j));
            }
            a.reverse();
            sb.replace(i,i+k,a.toString());
            a=new StringBuilder();


        }
        return sb.toString();
    }
}