//time complexity=O(sqrt(area))
//space complexity=O(1)
class Solution {
    public int[] constructRectangle(int area) {
        // int [] arr=new int [2];
        //int sq=Math.sqrt(area);
        for(int i=(int)Math.sqrt(area);i>1;i--){
            if(area%i==0){
                return new int []{area/i,i};
            }
        }
        return new int []{area,1};

    }
}