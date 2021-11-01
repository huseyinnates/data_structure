class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(target-(nums[i]))&&list.contains(nums[i])&&!(list.lastIndexOf(target-nums[i])==list.indexOf(nums[i]))){
                
                arr[0]=list.lastIndexOf(target-nums[i]);
                arr[1]=list.indexOf(nums[i]);
                return arr;
            }
        }
        return arr;
    }
}
//////////////////////////////////////////////////
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (valueIndexMap.containsKey(target - nums[i])) {
                return new int[]{i, valueIndexMap.get(target - nums[i])};
            } else {
                valueIndexMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
