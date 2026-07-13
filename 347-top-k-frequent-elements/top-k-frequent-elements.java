class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int arr:nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue(
            (a,b)->mp.get(b)-mp.get(a)
        );
        pq.addAll(mp.keySet());
        int []ans=new int[k];
        // while(!pq.isEmpty()){
        //     int c=pq.poll();
        //     int cnt=mp.get(c);

        // }
      
        int j=0;
        while(k-->0){
            int c=pq.poll();
            ans[j]=c;
            j++;
        }
        return ans;
    }
}