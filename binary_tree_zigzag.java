public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        ArrayList<Integer> root_list = new ArrayList();
        root_list.add(root.val);
        res.add(root_list);
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level_list = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode tmp = q.poll();
                if(tmp.left!=null){
                    q.add(tmp.left);
                    level_list.add(tmp.left.val);
                }   
                if(tmp.right!=null){
                    q.add(tmp.right);
                    level_list.add(tmp.right.val);
                }
            }
            res.add(level_list);
        }
        for(int i=0;i<res.size();i++){
            if(i%2==1){
                Collections.reverse(res.get(i));
            }
            if(res.get(i).size()==0)
                res.remove(i);
        }
        return res;
    }
}