class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode new_head = head.next;
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        while(tmp.next != null && tmp.next.next != null){
            ListNode first = tmp.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            tmp.next = second;
            tmp = first;
        }
        return new_head;
    }
}
