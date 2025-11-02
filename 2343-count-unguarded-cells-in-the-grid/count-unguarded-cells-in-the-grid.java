class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        
        // mark walls
        for (int i = 0; i < walls.length; i++) {
            int u = walls[i][0];
            int v = walls[i][1];
            grid[u][v] = 3;
        }
        
        // mark guards
        for (int i = 0; i < guards.length; i++) {
            grid[guards[i][0]][guards[i][1]] = 2; // <---- mark guards as 2
        }

        for (int i = 0; i < guards.length; i++) {
            int row = guards[i][0];
            int col = guards[i][1];
            
            // up
            int new_row1 = row - 1;
            while (new_row1 >= 0 && grid[new_row1][col] != 3 && grid[new_row1][col] != 2) {
                grid[new_row1][col] = 1;
                new_row1--;
            }

            // down
            int new_row2 = row + 1;
            while (new_row2 < grid.length && grid[new_row2][col] != 3 && grid[new_row2][col] != 2) {
                grid[new_row2][col] = 1;
                new_row2++;
            }

            // left
            int new_col1 = col - 1;
            while (new_col1 >= 0 && grid[row][new_col1] != 3 && grid[row][new_col1] != 2) {
                grid[row][new_col1] = 1;
                new_col1--;
            }

            // right
            int new_col2 = col + 1;
            while (new_col2 < grid[0].length && grid[row][new_col2] != 3 && grid[row][new_col2] != 2) {
                grid[row][new_col2] = 1;
                new_col2++;
            }
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}