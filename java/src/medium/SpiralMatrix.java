package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral
 * order.
 *
 * Input: [
 *
 * [ 1, 2, 3 ],
 *
 * [ 4, 5, 6 ],
 *
 * [ 7, 8, 9 ] ]
 *
 * Output: [1,2,3,6,9,8,7,4,5]
 */

class SpiralMatrix {

  public static void main(String[] args) {
    int[][] input = new int[3][4];
    for (int i = 0; i < 3; i++) {
      input[i] = new int[]{i * 4 + 1, i * 4 + 2, i * 4 + 3, i * 4 + 4};
    }
    System.out.println(Arrays.toString(spiralOrder(input).toArray()));
  }

  private static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();

    int lRow = 0;
    int lCol = 0;
    int rRow = matrix.length;
    if (rRow == 0) {
      return ans;
    }
    int rCol = matrix[0].length; // init border

    while (lRow < rRow && lCol < rCol) {
      for (int i = lCol; i < rCol; i++) {
        ans.add(matrix[lRow][i]);
      }
      for (int i = lRow + 1; i < rRow; i++) {
        ans.add(matrix[i][rCol - 1]);
      }

      if (!(lRow < rRow - 1 && lCol < rCol - 1)) {
        break;
      }
      for (int i = rCol - 2; i >= lCol; i--) {
        ans.add(matrix[rRow - 1][i]);
      }

      for (int i = rRow - 2; i > lRow; i--) {
        ans.add(matrix[i][lCol]);
      }
      lRow++;
      lCol++;
      rCol--;
      rRow--;
    }
    return ans;
  }
}
