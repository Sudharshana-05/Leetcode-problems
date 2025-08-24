class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0 , r = 0 , z = -1;
        int max = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
            if(z == -1) 
            l++;
            else
            r++;
            }
            else if(z == -1)
            z = i;
            else
            {
                z = i;
                l = r;
                r = 0;
            }
            max = Math.max(l+r,max);
        }
        if(z == -1)
         max--;
        return max;
    }
}