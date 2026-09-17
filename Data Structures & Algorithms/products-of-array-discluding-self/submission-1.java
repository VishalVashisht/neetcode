class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for(int i=0; i<n; ++i){
            if(i==0) {
                result[i] = 1;
                continue;
            }
            result[i] = result[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=n-1; i>=0; --i){
            result[i] = result[i]*right;
            right = right*nums[i];
        }
        return result;   
    }
}  