class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    max_area = Math.max(max_area, DFSArea(grid,i,j));
            }
        }
        return max_area;
    }
    
    public int DFSArea(int[][] grid, int i, int j){
        if(i>=0 && i< grid.length && j>=0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + DFSArea(grid,i+1,j) + DFSArea(grid,i-1,j) + DFSArea(grid, i, j-1) + DFSArea(grid, i, j+1);
        }
        else
            return 0;
    }
}
