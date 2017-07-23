public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode tmp = new ListNode(0);
        ListNode new_head = tmp;
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }
            else{
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = l1==null? l2:l1;
        return new_head.next;
    }
}