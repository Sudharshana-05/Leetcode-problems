class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return new String("0");

        StringBuilder res =new StringBuilder();
        if(numerator<0 ^ denominator<0 ) res.append("-");
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        res.append(n/d);
        long remainder= n % d;
        if(remainder==0) return res.toString();
        res.append(".");
        Map<Long,Integer> map= new HashMap<>();
        int index = res.length();
        while(remainder != 0){
            if(map.containsKey(remainder)){
                int pos=map.get(remainder);
                res.insert(pos,"(");
                res.append(")");
                return res.toString();
            }
            map.put(remainder,index);
            index++;
            res.append((remainder * 10)/d);
            remainder= (remainder * 10) % d;
        }
        return res.toString();
    }
}