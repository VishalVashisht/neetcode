class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        for(int i=0; i<n; ++i){
            if(i==0) {
                prefix[i] = 1;
                continue;
            }
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=n-1; i>=0; --i){
            prefix[i] = prefix[i]*right;
            right = right*nums[i];
        }
        return prefix;   
    }
}  