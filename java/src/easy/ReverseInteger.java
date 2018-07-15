package easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Input: -120
 * Output: -21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int num = -231;
        System.out.println(reverse(num));
    }

    private static int reverse(int x) {
        int num = Math.abs(x);
        int ans;
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        if (x < 0) sb.insert(0, '-');
        try {
            ans = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            ans = 0;
        }
        return ans;
    }
}
