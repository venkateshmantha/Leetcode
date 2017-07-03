public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        int lenA = 1;
        int lenB = 1;
        while(ptrA!=null){
            ptrA = ptrA.next;
            lenA++;
        }
        while(ptrB!=null){
            ptrB = ptrB.next;
            lenB++;
        }
        ptrA = headA;
        ptrB = headB;
        
        int diff = Math.abs(lenA-lenB);
        if(lenA>lenB){
            while(diff>0){
                ptrA = ptrA.next;
                diff--;
            }
        }
        else if(lenA<lenB){
            while(diff>0){
                ptrB = ptrB.next;
                diff--;
            }
        }

        while(ptrA!=ptrB){
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        return ptrA;
    }
}