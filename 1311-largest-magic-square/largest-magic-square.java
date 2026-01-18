class Solution {
    private boolean isMagic(int row, int col, int len, int[][] grid, int m, int n){
        if(row + len > m || col + len > n) return false;
        int[] rsum = new int[len];
        int[] csum = new int[len];
        int diag1 = 0, diag2 = 0;
        for(int i=0; i<len; i++){
            diag1 += grid[i+row][i+col];
            diag2 += grid[i+row][col+len-i-1];
            for(int j=0; j<len; j++){
                rsum[i] += grid[i+row][j+col];
                csum[j] += grid[i+row][j+col];
            }
        }
        if(diag1 != diag2 || diag1 != rsum[0] || diag1 != csum[0]) return false;
        for(int i=1; i<len; i++){
            if(rsum[i] != rsum[i-1] || csum[i] != csum[i-1]) return false;
        }
        return true;
    }
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int len = Math.min(m, n);
        int ans = 1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=len; k>=2; k--){
                    boolean found = isMagic(i, j, k, grid, m, n);
                    if(found) ans = Math.max(ans, k);
                }
            }
        }
        return ans;
    }
}