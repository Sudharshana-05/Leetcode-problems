class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        // Input: strs = ["eat","tea","tan","ate","nat","bat"]
        for(String word:strs){ //eat
            char[] arr=word.toCharArray();//['e','a','t']
            Arrays.sort(arr);//['a','e','t']
            String key=new String(arr);//aet
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(word);

        }
        return new ArrayList<>(mp.values());
        
        
    }
}