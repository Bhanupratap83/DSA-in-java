import java.util.*;
public class DiagonalTraversal{
    static class TreeNode{
        int data;
        TreeNode left, right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    public static ArrayList<Integer> Diagonal(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(q.isEmpty() == false){
            TreeNode curr = q.remove();

            while(curr != null){
                if(curr.left != null){
                    q.add(curr.left);
                }

                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
}