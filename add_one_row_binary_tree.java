public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode newNode = new TreeNode(v);
            newNode.left = root;
            return newNode;
        }
        else{
            Queue<TreeNode> q = new LinkedList();
            q.add(root);
            int depth =0;
            while(!q.isEmpty()){
                depth++;
                int size = q.size();
                if(depth==d-1){
                    for(int i=0;i<size;i++){
                        TreeNode tmp = q.poll();
                        TreeNode newLeftNode = new TreeNode(v);
                        newLeftNode.left = tmp.left;
                        TreeNode newRightNode = new TreeNode(v);
                        newRightNode.right = tmp.right;
                        tmp.left = newLeftNode;
                        tmp.right = newRightNode;
                        q.add(newLeftNode);
                        q.add(newRightNode);
                    }
                }
                else{
                    for(int i=0;i<size;i++){
                        TreeNode tmp = q.poll();
                        if(tmp.left!=null)
                            q.add(tmp.left);
                        if(tmp.right!=null)
                            q.add(tmp.right);
                    }
                } 
            }
            return root;
        }
    }
}