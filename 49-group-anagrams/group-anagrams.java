// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String,List<String>>mp=new HashMap<>();
//         // Input: strs = ["eat","tea","tan","ate","nat","bat"]
//         for(String word:strs){ //eat
//             char[] arr=word.toCharArray();//['e','a','t']
//             Arrays.sort(arr);//['a','e','t']
//             String key=new String(arr);//aet
//             mp.putIfAbsent(key,new ArrayList<>());
//             mp.get(key).add(word);

//         }
//         return new ArrayList<>(mp.values());
        
        
//     }
// }
// Approach 2: Character Frequency
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String str:strs){
            int[]cnt=new int[26];
            for(char c:str.toCharArray()){
                cnt[c -'a']++;
            }
            StringBuilder key=new StringBuilder();//key =""
            for(int i=0;i<26;i++){
              key.append("$").append(cnt[i]);
            }
            mp.putIfAbsent(key.toString(),new ArrayList<>());
            mp.get(key.toString()).add(str);
        }
        return new ArrayList<>(mp.values());
        
        
    }
}