package easy;

import utils.TreeNode;

//@formatter:off
/**
 *
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 */
// @formatter:on
class MergeTwoBinaryTrees {

  public static void main(String[] args) {
    TreeNode tree1 = new TreeNode(1);
    tree1.left = new TreeNode(3);
    tree1.left.left = new TreeNode(5);
    tree1.right = new TreeNode(2);
    System.out.println("Tree 1");
    TreeNode.printTree(tree1);

    TreeNode tree2 = new TreeNode(2);
    tree2.left = new TreeNode(1);
    tree2.left.right = new TreeNode(4);
    tree2.right = new TreeNode(3);
    tree2.right.right = new TreeNode(7);
    System.out.println("Tree 2");
    TreeNode.printTree(tree2);

    System.out.println("Merged");
    TreeNode.printTree(mergeTrees(tree1, tree2));
  }

  // TODO: smart way learned from leetcode
  private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    }
    TreeNode ans = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
    ans.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
    ans.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
    return ans;
  }
}
