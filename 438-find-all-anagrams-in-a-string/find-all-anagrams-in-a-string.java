

//Optimal Approach --> Fixed Sliding Window + 1Frequency Array + Counting 
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer>ans=new ArrayList<>();

    int[]Freq=new int[26];
  
    int n=s.length();
    int m=p.length();
    if(n<m)
    return ans;
    for(char ch:p.toCharArray()){
      Freq[ch-'a']++;
    }
    int cnt=0;
    for(int i=0;i<m;i++){
        int index=s.charAt(i)-'a';
        if(Freq[index]>0){
           cnt++;
        }
        Freq[index]--;

    }
    if(cnt==m){
        ans.add(0);
    }
   
    for(int i=m;i<n;i++){
        int addIndex=s.charAt(i)-'a';
        if(Freq[addIndex]>0){
            cnt++;
        }
        Freq[addIndex]--;
        int remove=s.charAt(i-m)-'a';
        if(Freq[remove]>=0){
            cnt--;
        }
        Freq[remove]++;
        if(cnt==m){
            ans.add(i-m+1);
        }
        
    
}
    return ans;

    }
}