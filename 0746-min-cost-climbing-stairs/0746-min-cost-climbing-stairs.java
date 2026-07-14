class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost, cost.length-1),solve(cost, cost.length-2));
    }
        public int solve(int[] cost,int n){
            
           if(n==0)return cost[0];
           if(n==1)return cost[1];
            if(dp[n]!=-1){
                return dp[n];
            }
            dp[n]=cost[n]+Math.min(solve(cost,n-1),solve(cost,n-2));
            return dp[n];
        }
    }