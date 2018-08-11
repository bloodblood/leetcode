package easy;

/**
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation: 1   (0 0 0 1) 4   (0 1 0 0) ↑   ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 */
class HammingDistance {

  public static void main(String[] args) {
    System.out.println(hammingDistance(1, 4));
  }

  private static int hammingDistance(int x, int y) {
    int distance = 0;
    while (x != 0 || y != 0) {
      System.out.println("x: " + x % 2 + "  y: " + y % 2);
      distance += x % 2 == y % 2 ? 0 : 1;
      x /= 2;
      y /= 2;
    }
    return distance;
  }
}
