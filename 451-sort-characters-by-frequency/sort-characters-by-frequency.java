class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        //using Priority Queue to implement the maxheap
        PriorityQueue<Character>pq=new PriorityQueue<>(
            (a,b) -> mp.get(b)-mp.get(a)
        );
        pq.addAll(mp.keySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int cnt=mp.get(c);
        
        while(cnt-->0){
            sb.append(c);
        }
        }
        return sb.toString();


    }
}