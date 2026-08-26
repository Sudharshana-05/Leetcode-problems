//Brute Force Approach
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//      double maxi = Double.NEGATIVE_INFINITY;
//       int n=nums.length;
//       for(int i=0;i<=n-k;i++){
//          double sum=0;
//          for(int j=i;j<i+k;j++){
//             sum+=nums[j];
//          }
//          double ans=sum/k;
//          maxi=Math.max(ans,maxi);
//       }  
//       return maxi;
    

//     }
// }

// Better Approach 
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
   
//       int n=nums.length;
//       int prefix[]=new int[n+1];
//       for(int i=0;i<n;i++){
//         prefix[i+1]=prefix[i]+nums[i];
//       }
//       double sum=0;
//        double maxi = Double.NEGATIVE_INFINITY;
//       for(int i=0;i<=n-k;i++){
//         sum=prefix[i+k]-prefix[i];
//         double res=(double)sum/k;
//         maxi=Math.max(maxi,res);
//       }
//       return maxi;
    

//     }
// }
// Optimal Approach -> Using fixed sliding window

class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double maxi=Double.NEGATIVE_INFINITY;
     double sum=0;
     int n=nums.length;
     for(int i=0;i<k;i++){
        sum+=nums[i];
     }
     double avg=(double)sum/k;
     maxi=avg;
     for(int i=k;i<n;i++){
        sum+=nums[i];
        sum-=nums[i-k];
        avg=sum/k;
        maxi=Math.max(avg,maxi);
     }
     
      return maxi;
    

    }
}