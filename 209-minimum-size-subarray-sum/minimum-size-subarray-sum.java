class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
       
        int i=0;
         int mini=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
               mini=Math.min(j-i+1,mini);
               sum-=nums[i];
               i++;
            }
        }
        return (mini==Integer.MAX_VALUE)?0:mini;
    }
}