class Solution {
   
       public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i=1; i<len;i++) {
            dp[i] = i==1 ? Math.max(nums[0], nums[1]) : Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[len-1];
    }

}
