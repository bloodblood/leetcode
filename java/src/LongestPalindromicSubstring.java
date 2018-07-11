/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 */


// TODO: 算法超时
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "babewrqwre";
        System.out.println(longestPalindrome(input));
    }

    // naive solution
    private static String longestPalindrome(String s) {
        char[] data = s.toCharArray();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                int tempLength = j - i + 1;
                char[] temp = new char[tempLength];
                System.arraycopy(data, i, temp, 0, tempLength);
                boolean isPalindrome = checkPalindrome(temp);
                if (!isPalindrome) continue;
                if (maxLength < tempLength) {
                    start = i;
                    maxLength = tempLength;
                }
            }
        }
        return String.copyValueOf(data, start, maxLength);
    }

    private static boolean checkPalindrome(char[] temp) {
        int length = temp.length;
        for (int i = 0; i <= length / 2; i++) {
            if (temp[i] != temp[length - i - 1])
                return false;
        }
        return true;
    }
}
