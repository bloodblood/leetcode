package easy;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2,
 *
 * merge nums2 into nums1 as one sorted array.
 *
 *
 * Input:
 *
 * nums1 = [1,2,3,0,0,0], m = 3
 *
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] nums2 = new int[]{2, 5, 6};
    merge(nums1, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1));
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int allSize = m;
    int curIndex = 0;
    for (int i = 0; i < n; i++) {
      int temp = nums2[i];
      boolean flag = false;
      for (int j = curIndex; j < allSize; j++) {
        if (nums1[j] > temp) {
          // insert here
          for (int k = allSize; k > j; k--) {
            nums1[k] = nums1[k - 1];
          }
          nums1[j] = temp;
          curIndex = j;
          allSize++;
          flag = true;
          break;
        }
      }
      if (!flag) {
        nums1[allSize] = temp;
        allSize++;
      }
    }
  }
}
