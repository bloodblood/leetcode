package easy;

/**
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    private static String countAndSay(int n) {
        if (n == 1) return "1";
        String pre = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < pre.length()) {
            int count = 1;
            while (j + count < pre.length() && pre.charAt(j) == pre.charAt(j + count)) {
                count++;
            }
            sb.append(count);
            sb.append(pre.charAt(j));
            j+=count;
        }

        return sb.toString();
    }
}
