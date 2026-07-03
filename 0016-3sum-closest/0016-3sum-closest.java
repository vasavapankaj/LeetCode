class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        int left = i+1;
        int right = n-1;
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for(i=0;i<n-2;i++){
            left = i+1;
            right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return closest;
    }
}

