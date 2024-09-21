public class ConstructTreeFromPreorderAndInorder{
    static class TreeNode{
        int data;
        TreeNode left, right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private int preorderIdx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preorderIdx = 0;
        return helper(preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode helper(int preorder[], int inorder[], int inorderStart, int inorderEnd){
        if(inorderStart > inorderEnd){
            return null;
        }

        int rootVal = preorder[preorderIdx++];
        TreeNode root = new TreeNode(rootVal);

        int inorderIdx = -1;
        for(int i=inorderStart; i<=inorderEnd; i++){
            if(inorder[i] == rootVal){
                inorderIdx = i;
                break;
            }
        }

        root.left = helper(preorder, inorder, inorderStart, inorderIdx-1);
        root.right = helper(preorder, inorder, inorderIdx+1, inorderEnd);

        return root;
    }
}