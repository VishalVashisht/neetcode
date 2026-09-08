class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; ++i){
            int diff = target - nums[i];
            if(hash.containsKey(diff)){
                return new int[]{hash.get(diff), i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}