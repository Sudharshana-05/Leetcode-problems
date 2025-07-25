class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi=Double.MIN_VALUE;
        double wsum=0;
        // double avg=0;
        // double sum=0;
        // if(k==1){
        //     for(int i=0;i<k;i++){
        //         sum+=nums[i];
        //         avg=sum/k;
        //         return avg;
        //     }
        // }
        for(int i=0;i<k;i++){
            wsum+=nums[i];
        }
        maxi=wsum;
        for(int i=k;i<nums.length;i++){
            wsum=wsum-nums[i-k]+nums[i];
            
            maxi=Math.max(wsum,maxi);
        }
        return maxi/k;

    }
}