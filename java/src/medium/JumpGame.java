package medium;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the
 * array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * Input: [2,3,1,1,4]
 *
 * Output: true
 *
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
class JumpGame {

  public static void main(String[] args) {
    int[] input = new int[]{3, 2, 1, 0, 4};
    System.out.println(canJump(input));
  }

  private static boolean canJump(int[] nums) {
    int endIndex = nums.length - 1;
    for (int i = endIndex; i >= 0; i--) {
      if (i + nums[i] >= endIndex) {
        endIndex = i;
      }
    }

    return endIndex == 0;
  }
}
