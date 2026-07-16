// class Solution {
//     public List<String> topKFrequent(String[] words, int k) {
//         HashMap<String,Integer>mp=new HashMap<>();
//         for(String word:words){
//             mp.put(word,mp.getOrDefault(word,0)+1);
//         }
//         PriorityQueue<String>pq=new PriorityQueue<>(
//             (a,b)->{
//                 if(mp.get(a).equals(mp.get(b))){
//                     return a.compareTo(b);
//                 }
//                 return mp.get(b)-mp.get(a);
//             }
//         );
//         pq.addAll(mp.keySet());
//         String[]ans=new String[k];
//         int j=0;
//         while(k-->0){
//             String str=pq.poll();
//             ans[j]=str;
//             j++;
//         }
//         return Arrays.asList(ans);
            
        
//     }
// }

class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String,Integer>mp=new HashMap<>();
        for(String str:words){
            mp.put(str,mp.getOrDefault(str,0)+1);
        }
        ArrayList<String>[]bucket=new ArrayList[words.length+1];
        for(String  c:mp.keySet()){
            int f=mp.get(c);
            if(bucket[f]==null){
                bucket[f]=new ArrayList<>();
            }
            bucket[f].add(c);
        }
        String[]ans=new String[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                Collections.sort(bucket[i]);
                for(String nums:bucket[i]){
                    ans[index]=nums;
                    index++;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return Arrays.asList(ans);
    }
        }
