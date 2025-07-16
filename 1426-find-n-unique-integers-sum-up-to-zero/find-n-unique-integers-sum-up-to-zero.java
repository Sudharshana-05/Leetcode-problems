class Solution {
    public int[] sumZero(int n) {
        int []arr=new int [n];
        int start=0,end=n-1;
        int temp=n/2;
        while(temp>0 && start<end){
            
            arr[start]=temp;
            arr[end]=temp*(-1);
            start++;
            end--;
            temp--;
        }
        return arr;
    }
    
}