public class DiameterOfTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    } 

    public static int diameter2(Node root){ //O(n^2)
        if(root == null){
            return 0;
        }
        int leftDia = diameter2(root.left);
        int leftHei = height(root.left);
        int rightDia = diameter2(root.right);
        int rightHei = height(root.right);

        int selfDia = leftHei + rightHei ;
        //int selfHei = leftHei + rightHei ;  leetcode pe ye sahi run hua h pta nhi ku
       
        return Math.max(Math.max(leftDia, rightDia), selfDia);
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){ //O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info (diam, ht);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // System.out.println(diameter2(root));

        System.out.println(diameter(root).diam);
    }
}