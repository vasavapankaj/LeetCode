class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i = 0 ; i < nums.length; i++){

            // ans ^ ans = 0
            // ans ^ 0 = ans
            ans = ans ^ nums[i];
        }
        return ans;
    }
}