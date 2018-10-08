package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2
 * respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 */
public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] input = new int[]{1, 1, 2};
    System.out.println(
        "After remove length: " + Arrays.toString(input) + " => " + removeDuplicates(input));
  }

  private static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }
}
