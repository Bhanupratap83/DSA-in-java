import java.util.*;
class StackUsingTwoQueue {

    static class StackQ{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){ // q1, q2 dono check krne padenge kisi me bhi elements ho skte h
            return q1.isEmpty() && q2.isEmpty(); 
        }

        //add
        public static void push(int data){  //O(1)
            if(!q1.isEmpty()){
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // remove
        public static int pop(){  //O(n)
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()){ // agr q1 me saare elements h 
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            } else {  // agr q2 me saare elements h 
                while(!q2.isEmpty()){
                    top = q1.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek
        public static int peek(){  //O(n)
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()){ // agr q1 me saare elements h 
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            } else {  // agr q2 me saare elements h 
                while(!q2.isEmpty()){
                    top = q1.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }    
}
