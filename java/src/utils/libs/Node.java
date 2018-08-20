package utils.libs;

/**
 * TreeNode Visualizer, Thanks
 * <br>
 * https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
 */
public class Node<T extends Comparable<?>> {

  public Node<T> left, right;
  T data;

  public Node(T data) {
    this.data = data;
  }
}

