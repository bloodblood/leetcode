package utils;

/**
 * TreeNode Visualizer, Thanks
 * <br>
 * https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
 */
class Node<T extends Comparable<?>> {

  Node<T> left, right;
  T data;

  public Node(T data) {
    this.data = data;
  }
}

