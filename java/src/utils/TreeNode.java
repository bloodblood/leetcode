package utils;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public static void printTree(TreeNode root) {
    Node<Integer> tree = cloneTreeToNode(root);
    BTreePrinter.printNode(tree);
  }

  private static Node<Integer> cloneTreeToNode(TreeNode root) {
    if (root == null) {
      return null;
    }
    Node<Integer> ans = new Node<>(root.val);
    ans.left = cloneTreeToNode(root.left);
    ans.right = cloneTreeToNode(root.right);
    return ans;
  }
}
