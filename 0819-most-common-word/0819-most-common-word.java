class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        HashMap<String,Integer> hm=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();

        for(int i=0;i<banned.length;i++){
            al.add(banned[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<paragraph.length();i++){
            // if(paragraph.charAt(i)!=' '){
                if(Character.isLetterOrDigit(paragraph.charAt(i)))
                    sb.append(paragraph.charAt(i));
            // }
            else{
                if(sb.length()>0 && !al.contains(sb.toString())){
                    hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
                }    
                sb.setLength(0);;
            }

        }
        if(sb.length()>0 && !al.contains(sb.toString())){
            hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
        }  
        int max=-1;
        for (Integer value : hm.values()) {
            if(value>max){
                max=value;
            }

        }

        String ans="";
        for (String key : hm.keySet()){
            if(hm.get(key)==max){
                ans=key;
            }
        }
    
        return ans;
    }
}