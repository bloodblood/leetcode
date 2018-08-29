package easy;

/**
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * <br>
 * Output: 6
 * <br>
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
class MaximumSubarray {

  public static void main(String[] args) {
    int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(input));
  }

  // brute way
  private static int maxSubArray(int[] nums) {
    int max = nums[0];
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum > max) {
          max = sum;
        }
      }
    }
    return max;
  }
}
