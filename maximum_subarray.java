class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],local=nums[0];
        //we start i=1 because we declare first inputs as a start point
        //for max and local
        for(int i=1;i<nums.length;i++){
            local=Math.max(nums[i]+local,nums[i]);
            max=Math.max(local,max);
            
        }
        return max;
    }
}
