/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) 
            return null;
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) 
            return null;
        
        int idMax = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[idMax]) {
                idMax = i;
            }
        }
        
        TreeNode root = new TreeNode(nums[idMax]);
        
        root.left = helper(nums, start, idMax - 1);
        root.right = helper(nums, idMax + 1, end);
        
        return root;
    }
}
