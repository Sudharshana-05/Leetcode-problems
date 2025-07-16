class Solution {
    public int maximumLength(int[] nums) {
        int countEven = 0;
        int prevMod = 0;

        // Count all even consecutive elements
        for (int num : nums) {
            if (prevMod == num % 2) {
                countEven++;
                prevMod = num % 2;
            }
        }

        int countOdd = 0;
        prevMod = 1;

        // Count all odd consecutive elements
        for (int num : nums) {
            if (prevMod == num % 2) {
                countOdd++;
                prevMod = num % 2;
            }
        }

        int countAlt = 0;
        prevMod = -1;

        // Count alternating even-odd sequence
        for (int num : nums) {
            if (prevMod == num % 2)
                continue;
            countAlt++;
            prevMod = num % 2;
        }

        return Math.max(countAlt, Math.max(countEven, countOdd));
    }
}