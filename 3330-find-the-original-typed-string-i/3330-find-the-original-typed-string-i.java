class Solution {
    public int possibleStringCount(String word) {
        int ans=1;
        // HashMap<Character,Integer> hm=new HashMap<>();
        // for(int i=0;i<word.length();i++){
        //     if(!hm.containsKey(word.charAt(i))){
        //         hm.put(word.charAt(i),1);
        //     }
        //     else{
        //         hm.put(word.charAt(i),hm.get(word.charAt(i))+1);
        //     }
        // }
        // for(Map.Entry<Character,Integer> element:hm.entrySet()){
        //     if(element.getValue()>1){
        //         ans+=element.getValue()-1;

        //     }
        // }
        int repeat=0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                repeat++;
            }
            else{
                ans+=repeat;
                repeat=0;
            }
        }
        ans+=repeat;
        
        return ans;
        
    }
}