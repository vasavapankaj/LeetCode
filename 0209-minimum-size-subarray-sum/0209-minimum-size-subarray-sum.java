class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(high < n){
            sum += nums[high];
            while(sum >= target){
                int minLen = high - low + 1;
                res = Math.min(res,minLen);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if (res == Integer.MAX_VALUE) {
        return 0;
        } else {
        return res;
        }
    }
}