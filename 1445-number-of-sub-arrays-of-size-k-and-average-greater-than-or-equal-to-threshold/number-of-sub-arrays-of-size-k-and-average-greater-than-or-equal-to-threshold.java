//arr=   [2,2,2,2,5,5,5,8]
//prefix=[0,2,4,6,8,13,18,23,31] k=3
// 0,2,4,6,[8,13,18],23,31
class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        int cnt=0;
        int prefix[]=new int[n+1];
        for(int i=0;i<n;i++){
           prefix[i+1]=prefix[i]+arr[i];
        }
        for(int i=0;i<=n-k;i++){
            sum=prefix[i+k]-prefix[i];
            int avg=sum/k;
            if(threshold<=avg)
            cnt++;
        }
        return cnt;

    }
}
// 