
class Solution {
    public int maximumLength(int[] nums, int k) {
        int maxLen = 1;
        for (int target_rem = 0; target_rem < k; target_rem++) {
            int[] dp = new int[k];
            for (int num : nums) {
                int curr_rem = num % k;
                int prev_rem = (target_rem - curr_rem + k) % k;
                int newLen = 1 + dp[prev_rem];
                dp[curr_rem] = newLen;
                maxLen = Math.max(maxLen, dp[curr_rem]);
            }
        }
        
        return maxLen;
    }
}