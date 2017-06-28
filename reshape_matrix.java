public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        if(r*c != rows*columns)
            return nums;
        int[][] res = new int[r][c];
        int res_r = 0;
        int res_c = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(res_c>=c){
                	res_r++;
                    res_c=0;
                }
               res[res_r][res_c++] = nums[i][j];
            }
        }
        return res;
    }
}