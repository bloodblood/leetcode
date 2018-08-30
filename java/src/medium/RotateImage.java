package medium;

import java.util.Arrays;

/**
 * Given input matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 */

public class RotateImage {

  public static void main(String[] args) {
    int[][] matrix = new int[3][3];
    matrix[0] = new int[]{1, 2, 3};
    matrix[1] = new int[]{4, 5, 6};
    matrix[2] = new int[]{7, 8, 9};
    rotate(matrix);
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
  }

  private static void rotate(int[][] matrix) {
    for (int i = 0; i < matrix.length / 2; i++) {
      int[] temp = matrix[i];
      matrix[i] = matrix[matrix.length - i - 1];
      matrix[matrix.length - i - 1] = temp;
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}
