package easy;

import java.util.Arrays;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSum solution = new TwoSum();
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));

    }

    private int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++)
            for (int j = i + 1; j < length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return null;
    }
}
