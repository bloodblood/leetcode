package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Input: candidates = [2,3,6,7], target = 7, A solution set is: [ [7], [2,2,3] ]
 */

// Learn from discussion
class CombinationSum {

  public static void main(String[] args) {
    int target = 7;
    int[] candidates = new int[]{2, 3, 6, 7};
    System.out.println(Arrays.deepToString(combinationSum(candidates, target).toArray()));
  }

  private static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    recursiveSum(ans, new ArrayList<>(), candidates, target, 0);
    return ans;
  }

  private static void recursiveSum(List<List<Integer>> ans, List<Integer> temp, int[] candidates,
      int target, int index) {
    if (target == 0) {
      ans.add(new ArrayList<>(temp));
    } else {
      for (int i = index; i < candidates.length; i++) {
        if (candidates[i] <= target) {
          temp.add(candidates[i]);
          recursiveSum(ans, temp, candidates, target - candidates[i], i);
          temp.remove(temp.size() - 1);
        }
      }
    }
  }

}
