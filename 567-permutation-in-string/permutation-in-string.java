class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        
        char []s1Arr=s1.toCharArray();
        Arrays.sort(s1Arr);
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            char[]s2Arr=sub.toCharArray();
            Arrays.sort(s2Arr);
            if(Arrays.equals(s1Arr,s2Arr)){
            return true;
        }

        }
        
        return false;
    }
}