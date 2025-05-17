class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int line=1;
        int arr[]=new int[2];
        for(int i=0;i<s.length();i++)
        {
            if(sum+ widths[s.charAt(i)-'a']<=100)
                sum+=widths[s.charAt(i)-'a'];
            else{
                line++;
                sum=0;
                sum+=widths[s.charAt(i)-'a'];
            }
        }
        arr[0]=line;
        arr[1]=sum;
        return arr;
    }
}