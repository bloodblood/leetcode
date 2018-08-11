package easy;

/**
 * Input: -121 Output: false Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 */
class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println(isPalindrome(-121));
  }

  private static boolean isPalindrome(int x) {
    StringBuilder sb = new StringBuilder(Integer.toString(x));
    String str = sb.toString();
    String strReverse = sb.reverse().toString();
    return str.equals(strReverse);
  }
}
