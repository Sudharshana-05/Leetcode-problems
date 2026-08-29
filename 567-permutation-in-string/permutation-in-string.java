//Better Approach [Fixed Sliding Window + 2 Frequency array]
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] s1Freq=new int[26];
        int[] s2Freq=new int[26];
        if(n>m){
            return false;
        }
        for(char ch:s1.toCharArray()){
            s1Freq[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            s2Freq[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1Freq,s2Freq)){
            return true;
        }
        for(int i=n;i<m;i++){
            s2Freq[s2.charAt(i)-'a']++;
            s2Freq[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(s1Freq,s2Freq)){
                return true;
            }
        }

        return false;
    }
}