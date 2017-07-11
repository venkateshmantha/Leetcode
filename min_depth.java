public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int L = minDepth(root.left), R = minDepth(root.right);
        return 1 + (Math.min(L, R) > 0 ? Math.min(L, R) : Math.max(L, R));
    }
}