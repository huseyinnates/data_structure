class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int k=cost.length;
        for(int i=2;i<k;i++){
            cost[i]+=Math.min(cost[i-2],cost[i-1]);
        }
        return Math.min(cost[k-1],cost[k-2]);
    }
}
