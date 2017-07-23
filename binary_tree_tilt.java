public class Solution {
    int tilt = 0;
    
    public int findTilt(TreeNode root) {
        postorder(root);
        return tilt;
    }
    
    public int postorder(TreeNode root) {
        if (root == null) return 0;
        int leftSum = postorder(root.left);
        int rightSum = postorder(root.right);
        tilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}