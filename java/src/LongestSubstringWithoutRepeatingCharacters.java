import java.util.ArrayList;
import java.util.List;

/**
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));
    }

    private static int lengthOfLongestSubstring(String s) {
        char[] data = s.toCharArray();
        int ans = 0;
        int length = data.length;
        for (int i = 0; i < length; i++) {
            int tempAns = 0;
            List<Character> temp = new ArrayList<>();
            for (int j = i; j < length; j++) {
                if (temp.indexOf(data[j]) == -1) {
                    temp.add(data[j]);
                    tempAns++;
                } else {
                    break;
                }
            }
            ans = ans > tempAns ? ans : tempAns;
        }
        return ans;
    }
}
