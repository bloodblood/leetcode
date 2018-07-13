/**
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = new String[]{""};
        System.out.println(longestCommonPrefix(input));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char c;
        boolean isPrefix = true;
        if (strs.length == 0 || strs[0].length() == 0) return "";
        for (int i = 0; isPrefix && i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (String str : strs) {
                try {
                    if (str.charAt(i) != c) isPrefix = false;
                } catch (Exception e) {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix)
                sb.append(c);
        }
        return sb.toString();
    }
}
