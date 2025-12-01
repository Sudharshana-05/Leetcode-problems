class Solution {

    public boolean isValid(long mid, long a, long b, int arr[], int n)
    {
        long time = 0;

        for(int val : arr)
        {
            if(val <= mid)
            {
                time+= val;
            }else 
            {
                time+=mid;
            }
        }

        return time >= mid * n;
    }
    public long maxRunTime(int n, int[] batteries) {
        // Using Modified  Binary Search

        long startTime = 0;
        long endTime = 0;

        for(int val : batteries)
        {
            endTime+= val;
        }
        
        long ans = 0;

        while( startTime <= endTime)
        {
            long mid = startTime + (endTime - startTime) / 2;

            if(isValid(mid, startTime, endTime, batteries, n))
            {
                ans = mid;
                startTime = mid + 1;
            }else 
            {
                endTime = mid - 1;
            }
        }

        return ans;
    }
}