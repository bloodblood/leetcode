package medium;

/**
 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 * Then take as many numerical digits as possible, which gets 42.
 * <b>atoi method</b>
 * tips: MAX_INTEGER
 * space ignore
 * + -
 */
public class StringToInteger {
    public static void main(String[] args) {
        String num = "42";
        System.out.println(myAtoi(num));
    }

    private static int myAtoi(String str) {
        char[] data = str.toCharArray();
        int isNegative = 1;
        boolean numBegins = false;
        long ans = 0;
        for (char c : data) {
            if (!numBegins) {
                if (c == '-' || c == ' ' || c == '+') {
                    if (c != ' ') {
                        isNegative = c == '+' ? 1 : -1;
                        numBegins = true;
                    }
                } else {
                    if (Character.isDigit(c)) {
                        ans = c - '0';
                        numBegins = true;
                    } else {
                        break;
                    }
                }
            } else {
                if (Character.isDigit(c)) {
                    ans = ans * 10 + (c - '0');
                    if (ans > Integer.MAX_VALUE)
                        return isNegative == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                } else break;
            }
        }
        return (int) ans * isNegative;
    }
}
