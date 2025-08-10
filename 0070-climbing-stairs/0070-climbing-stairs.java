class Solution {
    int ans=0;
    int dp[];
    public int climbStairs(int n){
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n);
    }
    public int solve(int i,int n){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i]=solve(i+1,n)+solve(i+2,n);

        return dp[i];

    }
}