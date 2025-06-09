class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int low=0,high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<letters[mid]){
                    high=mid-1;
                    res=letters[mid];
            }
            else{
                //high=mid-1;
                low=mid+1;
            }
                

            
        }
        return res;

    }
}