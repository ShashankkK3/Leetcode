class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        TreeSet<Integer> ts=new TreeSet<>();
        for(Map.Entry<Integer,Integer> element:hm.entrySet()){
            if(element.getKey()==element.getValue()){
                ts.add(element.getKey());
            }
        }
        if(ts.size()!=0){
            return ts.last();
        }

        return -1;
    }
}