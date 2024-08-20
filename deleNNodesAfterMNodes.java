public class deleNNodesAfterMNodes{
    static class Node {
        int data;
        Node nextNode;

        Node(int d){
            data = d;
            nextNode = null;
        }
    }
    public static void customDeleteNode(LinkedList linkedlist, int M, int N){
        Node curr = linkedlist.linkedListHeadNode;
        Node prev = null;
        int countM = M;
        int countN = N;
        Node st1 = null;
        boolean flag = true;
        while(curr != null && N > 0){
            if(countM == 0){
                flag = false; // delete nahi krna h
                countM = M;
                st1 = prev; // st1 - 3
            }
            if(countN == 0){
                flag = true;
                countN = N;
                st1.nextNode = curr;
            }
            if(flag){
                countM--;
            } else {
                countN--;
            }
            prev = curr;
            curr = curr.nextNode;
        }
        if(countN != N){
            st1.nextNode = null;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(9);
        linkedList.addNode(1);
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(9);
        linkedList.addNode(4);
        linkedList.addNode(10);
        linkedList.addNode(1);

        int M = 2;
        int N = 1;
        linkedList.printLinkedList();

        System.out.println("M" + M + "N" + N);
        customDeleteNode(linkedList, M,N);
    }
}