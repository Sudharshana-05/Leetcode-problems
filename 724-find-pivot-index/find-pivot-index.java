class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
      int total=0,sum=0;
      for(int i=0;i<n;i++){
        total+=nums[i];
      }
      for(int i=0;i<n;i++){
        if(total-nums[i]-sum==sum){
            return i;
        }
        sum+=nums[i];
      }
      return -1;
    }
}