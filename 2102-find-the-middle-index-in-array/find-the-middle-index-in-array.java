class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        int sum=0;
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