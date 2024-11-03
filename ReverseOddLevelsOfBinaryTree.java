public class ReverseOddLevelsOfBinaryTree{
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        reverseOdds(root.left, root.right, 1);
        return root;
    }

    public void reverseOdds(TreeNode left, TreeNode right, int level){
        if(left == null || right == null) return;

        if(level % 2 != 0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        reverseOdds(left.left, right.right, level+1);
        reverseOdds(left.right, right.left, level+1);
    }
}