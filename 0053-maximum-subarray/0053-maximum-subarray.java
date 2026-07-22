class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int sum = 0;
        int max = nums[i];

        for(i = 0 ; i < n; i++){
            sum = sum + nums[i];
            max = Math.max(max,sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}