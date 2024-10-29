public class MaximumBinaryTree{
    public int maxRoot(int arr[], int start, int end){
        int max = Integer.MIN_VALUE, maxIdx = 0;
        for(int i=start; i<=end; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    public TreeNode BinTree(int nums[], int start, int end){
        if(start > end) return null;

        int pos = maxRoot(nums, start, end);
        TreeNode root = new TreeNode(nums[pos]);
        root.left = BinTree(nums, start, pos-1);
        root.right = BinTree(nums, pos+1, end);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return BinTree(nums, 0, nums.length-1);
    }
}