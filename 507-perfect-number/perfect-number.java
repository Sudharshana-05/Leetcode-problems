class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
       
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0 ){
                sum+=i;
                sum+=(num/i);
            }
        }
        if(sum==num && num!=1){
            return true;
        }
        return false;
    }
}