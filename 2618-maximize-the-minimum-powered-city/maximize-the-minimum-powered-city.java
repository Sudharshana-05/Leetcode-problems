class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] stationsPowers = new long[n + 1];

        for (int i = 0; i < n; i++) {
            stationsPowers[Math.max(0, i - r)] += stations[i];
            stationsPowers[Math.min(n, i + r + 1)] -= stations[i];
        }

        for (int i = 1; i < n; i++) {  // ✅ only up to n-1
            stationsPowers[i] += stationsPowers[i - 1];
        }

        long sum = 0;
        for (int s : stations) sum += s;
        long start = 0, end = sum + k, ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPowerPossible(stationsPowers, mid, r, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private boolean isPowerPossible(long[] power, long min, int r, int k) {
        int n = power.length - 1 ;
        long[] extraPower = new long[n + 1];

        for (int i = 0; i < n; i++) {
            extraPower[i] += (i > 0 ? extraPower[i - 1] : 0);
            long currPower = power[i] + extraPower[i];
            if (currPower >= min) continue;

            long diff = min - currPower;
            if (diff > k) return false;

            k -= diff;
            extraPower[i] += diff;
            if (i + 2 * r + 1 < n) {
                extraPower[i + 2 * r + 1] -= diff;
            }
        }
        return true;
    }
}