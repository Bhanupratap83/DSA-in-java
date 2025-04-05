public class DeleteNodeInLL{
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        DeleteNodeInLL ll = new DeleteNodeInLL();
        
        ll.deleteNode(head.next);
        printList(head);
    }

}