class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int i=0,j=i+k-1;
        int mini=Integer.MAX_VALUE;
        while(j<n){
            int temp=nums[j]-nums[i];
            if(temp<mini){
                mini=temp;
            }
                i++;
                j++;
            
        }
        return mini;
    }
}