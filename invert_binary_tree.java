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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode l = invertTree(root.right);
        TreeNode r = invertTree(root.left);
        root.left = l;
        root.right = r;
        return root;
    }
}