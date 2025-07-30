class Solution {
    public String longestNiceSubstring(String s) {
        int n=s.length();
        if(n<2) return "";
         boolean upper[]=new boolean[26];
         boolean lower[]=new boolean[26];
         for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper[c-'A']=true;
            }
            else{
               lower[c-'a']=true;
            }
         }
         for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int index=Character.toLowerCase(c)-'a';
            if(upper[index]!=lower[index]){
                  String left=longestNiceSubstring(s.substring(0,i));
                  String right=longestNiceSubstring(s.substring(i+1));
                  return left.length()>=right.length()?left:right;
            }
         }
         return s;
    }
}