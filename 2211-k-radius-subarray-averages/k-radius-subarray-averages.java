class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n];
        if(k==0){
            return nums;
        }
        if (2 * k + 1 > n) {
            Arrays.fill(res, -1);
            return res;
        }
        for(int i=0;i<k;i++){
            res[i] = -1;
            
        }
        
        for(int i=k;i<n-k;i++){
            res[i]=sum(nums,i,k);
        }
        for(int i=n-k;i<n;i++){
            res[i]=-1;
        }
        return res;
    }
    public int sum(int[] nums,int center,int k){
        long  sum=0;
        
        for(int i=center-k;i<=k+center;i++){
            sum+=nums[i];
        }
        long avg=sum/(2*k+1);
        return (int)avg;

    }
}