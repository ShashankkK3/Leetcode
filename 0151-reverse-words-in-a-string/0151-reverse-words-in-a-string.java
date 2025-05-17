class Solution {
    public String reverseWords(String s) {
        
        ArrayList<Integer> al=new ArrayList<>();
        String str=s.strip();
        int l=str.length();
        StringBuilder sb=new StringBuilder();
        al.add(l);
        for(int i=l-1;i>=0;i--){
            if(str.charAt(i)==' '){
                al.add(i+1);

            }
            

        }
        al.add(0);
        for(int i=1;i<al.size();i++){
            for(int j=al.get(i);j<al.get(i-1);j++){
                sb.append(str.charAt(j));
                
            }
            if(i==1){
                sb.append(' ');
            }
                

        }
        for(int i=0;i<sb.length()-1;i++){
            if(i<sb.length()-1 && (sb.charAt(i)==' ' && sb.charAt(i+1)==' ')){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString().strip();
        
    }
}