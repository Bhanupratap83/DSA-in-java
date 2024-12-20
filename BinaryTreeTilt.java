public class BinaryTreeTilt{
    int sum = 0;
    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        sum += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}