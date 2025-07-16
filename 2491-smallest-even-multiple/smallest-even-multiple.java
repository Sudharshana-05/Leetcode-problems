class Solution {
    public int smallestEvenMultiple(int n) {
        if(n==0){
            return 0;
        }
        return Math.abs(n*2)/gcd(2,n);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

}