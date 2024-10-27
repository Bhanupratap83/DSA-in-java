public class CousionsInBinaryTree{
    Map<Integer, Integer> hm = new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        hm.clear();
        return helper(root, x, y, 1) && (hm.get(x).equals(hm.get(y)));
    }
     private boolean helper(TreeNode root, int x, int y, int depth) {
        if (root == null) return true;

        hm.put(root.val, depth);

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)) {
                return false;
            }
        }

        return helper(root.left, x, y, depth + 1) && helper(root.right, x, y, depth + 1);
    }
}