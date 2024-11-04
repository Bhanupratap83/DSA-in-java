public class MinimumAbsoluteDifferenceInBST{
    public int getMinimumDifference(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;
         
        inorder(root, arr);
        for(int i=1; i<arr.size(); i++){      
            min=Math.min(min, arr.get(i) - arr.get(i-1));
        }

        return min;
    }

    public void inorder(TreeNode root, List<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

}