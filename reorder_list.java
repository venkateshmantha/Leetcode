class Solution {
    public void reorderList(ListNode head) {
        if(head==null)
            return;
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr.next!=null && fastptr.next.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        ListNode second_head = reverse(slowptr);
        ListNode res = head;
        while(head !=null && second_head!=null){
            ListNode tmp = head.next;
            head.next = second_head;
            ListNode tmp2 = second_head.next;
            second_head.next = tmp;
            head = tmp;
            second_head = tmp2;
        }
    
        
            
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
