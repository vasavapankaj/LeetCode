class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for(int i = 0 ; i < n; i++){
            if(count == 0){
                element = nums[i];
            }

            if(nums[i] == element){
                count += 1;
            }else{
                count -= 1;
            }
        }
        return element;
    }
}