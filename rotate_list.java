public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;
        ListNode tmp = head;
        int len =1;
        while(tmp.next!=null){
            tmp = tmp.next;
            len++;
        }
        k = k%len;
        tmp.next = head;
        for (int i=0;i<len-k;i++) {
            tmp = tmp.next;
        }
        head = tmp.next;
        tmp.next = null;
        return head;
    }
}