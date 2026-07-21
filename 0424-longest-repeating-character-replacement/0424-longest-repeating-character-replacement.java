class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] arr = new int[256];
        int low = 0;
        int maxCount = 0;
        int res = 0;
        for(int high = 0; high < n; high++){
            arr[s.charAt(high)]++;

            int len = high - low + 1;
            maxCount = Math.max(maxCount, arr[s.charAt(high)]);
            int diff = len - maxCount ;

            while(diff > k){
                arr[s.charAt(low)]--;
                low++;

                len = high - low + 1;
                maxCount = Math.max(maxCount, arr[s.charAt(high)]);
                diff = len - maxCount ;
            }
            len = high - low + 1;
            res = Math.max(res,len);
        }
        return res;
    }
}