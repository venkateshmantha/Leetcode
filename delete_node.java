public class Solution {
    public void deleteNode(ListNode node) {
        if(node.next!=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
        else
            node = null;
    }
}