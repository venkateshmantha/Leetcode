public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int res = depth(root.left)+depth(root.right);
        return Math.max(res,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
    private int depth(TreeNode root){
        if(root==null)
            return 0;
        return 1+ Math.max(depth(root.left),depth(root.right));
    }
}