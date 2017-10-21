public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr.next != null && fastptr.next.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                slowptr = head;
                while(fastptr != slowptr){
                    slowptr = slowptr.next;
                    fastptr = fastptr.next;
                }
                return slowptr;
            }
        }
        return null;
    }
}
