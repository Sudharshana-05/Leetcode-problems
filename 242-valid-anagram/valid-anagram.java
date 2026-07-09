// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length())
//         return false;
//         HashMap<Character,Integer>h1=new HashMap<>();
//         for(char c:s.toCharArray()){
//             h1.put(c,h1.getOrDefault(c,0)+1);
//         }
//         HashMap<Character,Integer>h2=new HashMap<>();
//         for(char c:t.toCharArray()){
//             h2.put(c,h2.getOrDefault(c,0)+1);
//         }
//         for(char c:s.toCharArray()){
//             if(!h1.get(c).equals(h2.get(c)))
//             return false;
//         }
//         return true;

//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer>h1=new HashMap<>();
        for(char c:s.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        
        for(char c:t.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)-1);
        }
        for(int freq: h1.values()){
            if(freq!=0)
            return false;
        }
        return true;

    }
}