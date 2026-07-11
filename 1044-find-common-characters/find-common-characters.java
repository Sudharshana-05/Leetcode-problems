class Solution {
    public List<String> commonChars(String[] words) {
        List<String>ans=new ArrayList<>();
        int[] minfreq=new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for(String word:words){
             int freq[]=new int[26];
             for(char c:word.toCharArray()){
                freq[c-'a']++;
             }
             for(int i=0;i<26;i++){
                minfreq[i]=Math.min(minfreq[i],freq[i]);
             }

        }
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                ans.add(String.valueOf((char)('a'+i)));
                minfreq[i]--;
            }
        }
        return ans;
      
        
    }
}