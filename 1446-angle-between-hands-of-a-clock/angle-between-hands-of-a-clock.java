class Solution {
    public double angleClock(int hour, int minutes) {
        double ans=(double) Math.abs((((30*hour)+(0.5*minutes))-(6*minutes)));
        if(ans>180){
            return (double)Math.abs(ans-360);
        }
        return ans;  
    }
}