package medium;

public class MinimumPathSum {

  private int[][] dp;

  private int getMinPath(int[][] grid, int x, int y) {
    if (x < 0 || y < 0) {
      return Integer.MAX_VALUE;
    }
    if (dp[x][y] != 0) {
      return dp[x][y];
    }
    if (x == 0 && y == 0) {
      return grid[0][0];
    }
    dp[x][y] = Math.min(getMinPath(grid, x - 1, y), getMinPath(grid, x, y - 1)) + grid[x][y];
    return dp[x][y];
  }

  public int minPathSum(int[][] grid) {
    dp = new int[grid.length][grid[0].length];
    return getMinPath(grid, grid.length - 1, grid[0].length - 1);
  }

  public static void main(String[] args) {
    int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    System.out.println(new MinimumPathSum().minPathSum(grid));
  }

}
