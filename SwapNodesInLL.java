//24. Swap Nodes in Pairs LeetCode

public class SwapNodesInLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void swapNodes(int x, int y){
        if(x==y){
            return;
        }
        Node prevX = null, currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null){
            return;
        }

        if(prevX != null){
            prevX.next = currY;
        } else {
            head = currY;
        }

        if(prevY != null){
            prevY.next = currX;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapNodesInLL ll = new SwapNodesInLL();

        // ll.addLast(7);
        // ll.addLast(6);
        // ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        ll.swapNodes(2, 4);
        ll.print();
    }
}
