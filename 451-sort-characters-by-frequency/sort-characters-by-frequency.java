// class Solution {
//     public String frequencySort(String s) {
//         HashMap<Character,Integer>mp=new HashMap<>();
//         for(char ch:s.toCharArray()){
//             mp.put(ch,mp.getOrDefault(ch,0)+1);
//         }
//         //using Priority Queue to implement the maxheap
//         PriorityQueue<Character>pq=new PriorityQueue<>(
//             (a,b) -> mp.get(b)-mp.get(a)
//         );
//         pq.addAll(mp.keySet());

//         StringBuilder sb=new StringBuilder();
//         while(!pq.isEmpty()){
//             char c=pq.poll();
//             int cnt=mp.get(c);
        
//         while(cnt-->0){
//             sb.append(c);
//         }
//         }
//         return sb.toString();


//     }
// }

class Solution{
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>[]bucket=new ArrayList[s.length()+1];

        for(char c:mp.keySet()){
            int f=mp.get(c);
            if(bucket[f]==null){
                bucket[f]=new ArrayList<>();
            }
            bucket[f].add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}