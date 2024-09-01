import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {

    public static void reverseFirst(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        int size = q.size();

        for(int i=0; i<size-k; i++){
            q.add(q.remove());
        }

        // if(k % 2 == 0){
        //     reverse(q);
        // }

        
        // q.add(q.remove());
        // q.add(firstHalf.remove());



    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 5;

        reverseFirst(q, k);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
