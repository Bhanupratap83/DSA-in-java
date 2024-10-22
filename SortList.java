public class SortList{
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode sortList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode mid = mid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(midNext);

        return mergeSort(leftHalf, rightHalf);
    }

    public static ListNode mid(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeSort(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            if(l1 != null) curr.next = l1;
            if(l2 != null) curr.next = l2;

            return dummy.next;
        }
    }
}