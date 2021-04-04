package recursionII;


class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
      this.key = key;
    }
}
public class Lca {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {
        if (root == null){
            return null;
        }
        if (root == one || root == two){
            return root;
        }
        TreeNode ll = lowestCommonAncestor(root.left, one, two);
        TreeNode lr = lowestCommonAncestor(root.right, one, two);
        if (ll != null && lr != null){
            return root;
        }
        return ll == null ? lr:ll;
    }

    public static void main(String[] arg){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(9);
        TreeNode t1 = root.left;
        root.right = new TreeNode(12);
        TreeNode t2 = root.right;
        root.left.left = new TreeNode(2);
        TreeNode t3 = root.left.left;
        root.left.right = new TreeNode(3);
        TreeNode t4 = root.left.right;
        root.right.right = new TreeNode(14);
        TreeNode t5 = root.right.right;
        TreeNode result = lowestCommonAncestor(root, t3, t5);
        System.out.println(result.key);
    }
}
