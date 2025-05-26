class Solution {
    public int rearrangeCharacters(String s, String target) {
        int arr[]=new int[26];
        for(int i=0;i<target.length();i++){
            arr[target.charAt(i)-'a']++;
        }
        int arr2[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr2[s.charAt(i)-'a']++;
        }
        int count=0;
        int flag=1;
    
        while(flag==1){
            for(int i=0;i<26;i++){
                if((arr2[i]-arr[i])<0){
                    flag=0;

                    break;
                }
                else{
                    arr2[i]-=arr[i];

                }
            }
            count++;
        }
        return --count;
    }
}