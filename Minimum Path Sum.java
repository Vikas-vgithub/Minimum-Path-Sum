class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[n - 1].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int curr = Integer.MAX_VALUE;
                if(i - 1 >= 0){
                    curr = Math.min(curr, grid[i - 1][j]);
                }
                if(j - 1 >= 0){
                    curr = Math.min(curr, grid[i][j - 1]);
                }
                if(curr == Integer.MAX_VALUE){
                    curr = 0;
                }
                grid[i][j] += curr;
            }
        }
        
        return grid[n - 1][m - 1];
    }
}
