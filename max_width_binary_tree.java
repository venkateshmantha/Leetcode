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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        ArrayDeque<Integer>  count = new ArrayDeque<>();
        queue.offer(root);
        count.offer(0);
        int max = 1;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            int left = 0;
            int right = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = count.poll();
                if(i == 0)  left = index;
                if(i == size-1)  right = index;
                if(node.left != null) {
                    queue.offer(node.left);
                    count.offer(index*2);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                    count.offer(index*2 + 1);
                }
            }
            max = Math.max(max,right - left + 1);
        }
        return max;
    }
}
