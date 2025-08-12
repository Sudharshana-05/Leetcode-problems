class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceSubarrays(nums,k)-niceSubarrays(nums,k-1);
    }
    public int niceSubarrays(int []nums,int k){
           int l=0,c=0,odd=0;
           for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2==1){
                    odd--;
                }
                l++;
            }
            c+=r-l+1;
           }
           return c;
    }
}