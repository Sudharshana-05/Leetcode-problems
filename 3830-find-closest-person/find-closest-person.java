class Solution {
    public int findClosest(int x, int y, int z) {
    //    int val1=Math.abs(z-x);
    //    int val2=Math.abs(z-y);

    //   if(val1<val2){
    //     return 1;
    //   }else if(val1>val2){
    //   return 2;
    //   }else{
    //     return 0;
    //   }


    int diff1=Math.abs(z-x);
    int diff2=Math.abs(z-y);

    if(diff1==diff2){return 0;}

    if(diff1<diff2) return 1;
    else  return 2;
    }
}