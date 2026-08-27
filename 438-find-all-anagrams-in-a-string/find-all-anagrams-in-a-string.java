// brute force Approach
//convert p into characters
// sort p
//take the substring of s
//convert the substring into characters
// sort the substring
//check whether sorted p and sorted substring are same,if yes,add it in the list
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//     List<Integer>ans=new ArrayList<>();
//     int n=s.length();
//     int m=p.length();
//     char []pArr=p.toCharArray();
//     Arrays.sort(pArr);
//     for(int i=0;i<=n-m;i++){
//         String sub=s.substring(i,i+m);
//         char []sArr=sub.toCharArray();
//         Arrays.sort(sArr);
    
//     if(Arrays.equals(pArr,sArr)){
//         ans.add(i);
//     }}
//     return ans;
//     }
// }

//Better Approach --> Fixed Sliding Window+ Frequency
//Instead of sorting,we can calculate its frequency
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer>ans=new ArrayList<>();

    int[]pFreq=new int[26];
    int []wFreq=new int[26];
    int n=s.length();
    int m=p.length();
    if(n<m)
    return ans;
    for(char ch:p.toCharArray()){
      pFreq[ch-'a']++;
    }
    for(int i=0;i<m;i++){
        wFreq[s.charAt(i)-'a']++;
    }
    if(Arrays.equals(wFreq,pFreq)){
        ans.add(0);
    }
    for(int i=m;i<n;i++){
        wFreq[s.charAt(i)-'a']++;
        wFreq[s.charAt(i-m)-'a']--;
        if(Arrays.equals(wFreq,pFreq)){
            ans.add(i-m+1);
        }
    }
    return ans;

    }
}