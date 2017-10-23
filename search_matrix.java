/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows == 0)
            return false;
        int cols = matrix[0].length;
        if(cols == 0)
            return false;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]>target){
                if(i-1>=0){
                    return search(matrix,i-1,target);
                }
                else
                    return false;
            }
        }
        return search(matrix,rows-1,target);
    }
    
    public boolean search(int[][] matrix, int row, int target){
        int len = matrix[0].length;
        int start = 0;
        int end = len-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(matrix[row][mid]==target)
                return true;
            else if(matrix[row][mid]>target)
                end = mid -1;
            else
                start = mid+1;
        }
        return false;
    }
}
