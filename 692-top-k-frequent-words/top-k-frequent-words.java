class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>mp=new HashMap<>();
        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>(
            (a,b)->{
                if(mp.get(a).equals(mp.get(b))){
                    return a.compareTo(b);
                }
                return mp.get(b)-mp.get(a);
            }
        );
        pq.addAll(mp.keySet());
        String[]ans=new String[k];
        int j=0;
        while(k-->0){
            String str=pq.poll();
            ans[j]=str;
            j++;
        }
        return Arrays.asList(ans);
            
        
    }
}