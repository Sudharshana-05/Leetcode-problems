class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int pos=1;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            pre*=nums[i];
            pos*=nums[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,pos));
            if(pre==0)pre=1;
            if(pos==0)pos=1;
        }
        return maxi;

    }
}