class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0 , res = 0;
        int left = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int right = 0; right < n; right++){
            freq.put(fruits[right],freq.getOrDefault(fruits[right], 0) + 1);

             // shrink window if more than 2 fruit types
            while(freq.size() > 2){
                int leftFruits = fruits[left];
                freq.put(leftFruits,freq.get(leftFruits) - 1);

                if(freq.get(leftFruits) == 0){
                    freq.remove(leftFruits);
                }
                left++;
            }

            if(freq.size() <= 2){
                maxLen = right - left + 1;
                res = Math.max(res,maxLen);
            }
        }
        return res;   
    }
}