class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        boolean change=false;
        int i=0;
        while(true){
            if(i>=sb.length()-1){
                i=0;
                if(change==false){
                    break;

                }
                change=false;
            }
            else if(Math.abs(sb.charAt(i)-sb.charAt(i+1))==32){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                change=true;

            }
            else{
                i++;

            }
               
            



        }
        return sb.toString();
    }
}