public int findSecondMinimumValue(TreeNode root) 
{
    int rootVal = root.val;
    int secondSmall =Integer.MAX_VALUE;
    boolean diffFound = false;
    Queue<TreeNode> Q= new LinkedList<TreeNode>();
    Q.add(root);

    while(!Q.isEmpty())
    {
        TreeNode curr=Q.poll();
        if(curr.val!=rootVal && curr.val < secondSmall)
        {
            secondSmall=curr.val;
            diffFound=true;
        }
        if(curr.left!=null)
        {
            Q.add(curr.left);
            Q.add(curr.right);
        }
    }

    return (secondSmall == Integer.MAX_VALUE && !diffFound) ? -1 : secondSmall;
} 