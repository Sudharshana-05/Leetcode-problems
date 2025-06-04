class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=1;
        while(i<nums.length && nums[i]>=nums[i-1])
        i++;
        if(nums.length==i){
            return true;
        }
        i=1;
        while(i<nums.length && nums[i]<=nums[i-1])
        i++;
        return i==nums.length;
    }
}