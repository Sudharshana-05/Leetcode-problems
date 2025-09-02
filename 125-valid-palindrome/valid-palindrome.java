class Solution {
    public boolean checkPalindrome(String result){
       int left=0,right=result.length()-1;
       while(left<right){
        if(result.charAt(left)!=result.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;

    }
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String result=sb.toString();
        result=result.toLowerCase();
        if(checkPalindrome(result)){
            return true;
        }
        return false;
    }
}