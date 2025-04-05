public class LinkedListCycle{
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public static void printList(ListNode node){
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }


    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
 
        while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         if(slow == fast) return true;
        }
 
        return false;
     }
}