
public class RevisionLL {
    Node head;
    Node tail;

    public RevisionLL(){
        this.head = null;
        this.tail = null;
    }
    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // public static Node head;
    // public static Node tail;

    void traverse(){
        Node curr = head;
        while(curr != null){
            curr = curr.next;
        }
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){  // ll jab khali h
            head = newNode;
            tail = newNode;
        } else {            // jb ll me kuch data h
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+"->");
            curr = curr.next;
        }
    }

    void insertMiddle(int idx , int data){
        Node newNode = new Node(data);

        if(idx == 0){ // agr ll empty h to start me hi add hoga
            addFirst(data);
        } 
        else {
            Node curr = head;
            for(int i=0; i<idx-1; i++){
                curr = curr.next;
            }
            Node temp = curr.next;
            curr.next = newNode;
            newNode.next = temp;
        }
        
    }

}
