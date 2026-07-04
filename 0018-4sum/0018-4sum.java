class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int i = 0;
        int j;
        int n = nums.length;
        int left = i+1;
        int right = n-1;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                continue;
                left = j+1;
                right = n-1;
                while(left<right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right --;

                        while(left < n && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(right>=0 && nums[right] == nums[right+1]){
                            right--;
                        }
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}