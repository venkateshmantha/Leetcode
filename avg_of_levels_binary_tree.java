
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result = new ArrayList<Double>();
        if(root==null)
            return result;
        int av =0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int cnt = q.size();
            int denom = q.size();
            double sum=0;
            while(cnt-- > 0){
                TreeNode temp = q.remove();
                sum += temp.val;
                if (temp.left != null) 
                {
                    q.add(temp.left);
                }
                if (temp.right != null) 
                {
                    q.add(temp.right);
                }
            }
            result.add((double)sum/denom);
        }
        return result;
    }
}