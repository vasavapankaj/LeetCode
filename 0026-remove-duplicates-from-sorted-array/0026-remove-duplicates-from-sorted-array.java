class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        int j = 1;
        int res = 1;
        int n = arr.length;
        while(j < n){
            if(arr[j] == arr[j-1]){
                j++;
                continue;
            }
            arr[i+1]=arr[j];
            i++;
            j++;
            res++;
        }
        return res;
    }
}