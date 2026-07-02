class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int n = nums.length;
        int left = i+1;
        int right = n-1;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            left = i+1;
            right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right --;

                    while(left < n && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}