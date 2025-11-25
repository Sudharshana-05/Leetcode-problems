class Solution {
    public int smallestRepunitDivByK(int k) {
        Set<Integer> remainders = new HashSet<>();
        int num = 1;
        int rem = 1 % k;
        int count = 1;

        while(rem != 0 && !remainders.contains(rem) && count <= k) {
            remainders.add(rem);
            rem = rem * 10 + 1;
            rem = rem % k;
            count++;
        }

        if(rem == 0) {
            return count;
        }

        return -1;
    }
}