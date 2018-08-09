package todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
class ThreeSum {
    public static void main(String[] args) {
        int[] input = new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
        System.out.println(Arrays.deepToString(threeSum(input).toArray()));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = 0; k < nums.length && k != i && k != j; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort((Comparator.comparingInt(o -> o)));
                        ans.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ansList = new ArrayList<>();
        for (List<Integer> list : ans) {
            boolean has = false;
            for (List<Integer> list1 : ansList) {
                if (Arrays.equals(list.toArray(), list1.toArray())) {
                    has = true;
                    break;
                }
            }
            if (!has) ansList.add(list);
        }
        return ansList;
    }
}
