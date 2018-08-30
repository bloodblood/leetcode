package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 */


public class GroupAnagrams {
  public static void main(String[] args) {
    String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
    for (List<String> stringList : groupAnagrams(strs)) {
      System.out.println(Arrays.toString(stringList.toArray()));
    }
  }

  private static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> ans = new ArrayList<>();
    for (String str : strs) {
      boolean exist = false;
      String sorted = sortedString(str);
      for (int i = 0; i < ans.size() && !exist; i++) {
        List<String> temp = ans.get(i);
        if (temp.get(0).equals(sorted)) {
          exist = true;
          temp.add(str);
        }
      }
      if (!exist) {
        ans.add(new ArrayList<String>() {{add(sorted);add(str);}});
      }
    }
    for (List<String> stringList : ans) stringList.remove(0);
    return ans;
  }

  private static String sortedString(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
