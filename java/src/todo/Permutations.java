package todo;

import java.util.Arrays;
import java.util.List;

/**
 * Input: [1,2,3]
 * Output:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */
class Permutations {
    public static void main(String[] args) {
        //  System.out.println(Arrays.deepToString(permute(new int[]{1, 2, 3}).toArray()));
    }

    private static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 2) {
            return swapMerge(nums[0], nums[1]);
        } else {

        }
        return null;
    }

    private static List<List<Integer>> swapMerge(int a, int b) {
        List<Integer> sort1 = Arrays.asList(a, b);
        List<Integer> sort2 = Arrays.asList(b, a);
        return Arrays.asList(sort1, sort2);
    }

}
