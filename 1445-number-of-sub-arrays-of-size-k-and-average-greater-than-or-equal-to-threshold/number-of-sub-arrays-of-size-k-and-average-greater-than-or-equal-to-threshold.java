class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // Optimal Solution  --> using Fixed sliding window approach
        
           int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int cnt=0;
      int avg=sum/k;
      if(avg>=threshold){
        cnt++;
        }
        int n=arr.length;
        
     
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            avg=sum/k;
            if(avg>=threshold){
                cnt++;
            }
        }
        return cnt;
    }
}