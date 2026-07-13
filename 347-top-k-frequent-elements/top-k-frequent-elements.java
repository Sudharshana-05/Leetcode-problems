// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer>mp=new HashMap<>();
//         for(int arr:nums){
//             mp.put(arr,mp.getOrDefault(arr,0)+1);
//         }
//         PriorityQueue<Integer>pq=new PriorityQueue(
//             (a,b)->mp.get(b)-mp.get(a)
//         );
//         pq.addAll(mp.keySet());
//         int []ans=new int[k];
//         // while(!pq.isEmpty()){
//         //     int c=pq.poll();
//         //     int cnt=mp.get(c);

//         // }
      
//         int j=0;
//         while(k-->0){
//             int c=pq.poll();
//             ans[j]=c;
//             j++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int arr:nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }
        ArrayList<Integer>[]bucket=new ArrayList[nums.length+1];
       for(int c:mp.keySet()){
        int f=mp.get(c);
        if(bucket[f]==null){
            bucket[f]=new ArrayList<>();
        }
        bucket[f].add(c);
       }
        
        int []ans=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if (bucket[i]!=null){
                for(int num:bucket[i]){
                    ans[index++]=num;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}