public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=1;i<=size;i++){
                TreeNode tmp = q.poll();
                if(i==size)
                    res.add(tmp.val);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
            }
        }
        return res;
    }
}