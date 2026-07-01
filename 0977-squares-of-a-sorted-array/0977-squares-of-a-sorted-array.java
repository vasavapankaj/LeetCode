class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int left = 0;
        int right = nums.length-1;
        int k = n-1;
        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(leftSq < rightSq){
                res[k] = rightSq;
                k--;
                right--;
            }else{
                res[k] = leftSq;
                k--;
                left++;
            }

        }
        return res;

    }
}