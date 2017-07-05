/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int max_depth = 0;
        int curr_depth=0;
        curr_depth = 1+Math.max(maxDepth(root.right),maxDepth(root.left));
        if(curr_depth>max_depth)
            max_depth = curr_depth;
        return max_depth;
    }
}