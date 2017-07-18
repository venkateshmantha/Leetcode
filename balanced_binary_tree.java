public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return depth(root)!=-1;
            
    }
    
    private int depth(TreeNode node){
        if(node==null)
            return 0;
        int left_depth = depth(node.left);
        if(left_depth==-1)
            return -1;
        int right_depth = depth(node.right);
        if(right_depth==-1)
            return -1;
        if(Math.abs(left_depth-right_depth)>1)
            return -1;
        return 1+ Math.max(depth(node.left),depth(node.right));
    }
}