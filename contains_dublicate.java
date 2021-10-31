class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        while(index < nums.length){
            if(set.add(nums[index++]) == false) return true;
        }
        return false;
    }
}
