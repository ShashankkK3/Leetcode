class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x))){
                al.add(i);
            }
        }
        return al;
    }
}