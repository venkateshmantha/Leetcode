public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int queue_size = root == null ? 0 : 1;
        while(queue_size>0){
            
            int max = Integer.MIN_VALUE;
            for(int i=0;i<queue_size;i++){
                TreeNode tmp = q.poll();
                int value = tmp.val;
                max = Math.max(max,value);
                if(tmp.left!=null){
                    q.add(tmp.left);
                }
                if(tmp.right!=null){
                    q.add(tmp.right);
                }
            }
            
            res.add(max);
            queue_size = q.size();
        }
        
        return res;
    }
}