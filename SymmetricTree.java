public class SymmetricTree{
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode p, TreeNode q){
        if(p == q) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        if(!isEqual(p.left, q.right) || !isEqual(p.right, q.left)) return false;

        return true;
    }
}