package medium;

import java.math.BigInteger;

class MultiplyStrings {

  public static void main(String[] args) {
    String a = "52";
    String b = "60";
    String ans = multiply(a, b);
    System.out.println("ans: " + ans);
    BigInteger a1 = new BigInteger(a);
    BigInteger b1 = new BigInteger(b);
    System.out.println(a1.multiply(b1).toString().equals(ans));
  }

  private static String multiply(String num1, String num2) {
    char[] data1 = reverse(num1.toCharArray());
    char[] data2 = reverse(num2.toCharArray());
    int[] ans = new int[200];
    for (int i = 0; i < data1.length; i++) {
      for (int j = 0; j < data2.length; j++) {
        ans[i + j] += (data1[i] - '0') * (data2[j] - '0');
      }
    }
    for (int i = 0; i < ans.length - 1; i++) {
      int carry = ans[i] / 10;
      ans[i] = ans[i] % 10;
      ans[i + 1] += carry;
    }
    StringBuilder sb = new StringBuilder();
    int high = 0;
    for (int i = 0; i < ans.length; i++) {
      if (ans[i] != 0) {
        high = i;
      }
    }
    for (int i = high; i >= 0; i--) {
      sb.append(ans[i]);
    }

    return sb.toString();
  }

  private static char[] reverse(char[] input) {
    char[] output = new char[input.length];
    int j = 0;
    for (int i = input.length - 1; i >= 0; i--) {
      output[j++] = input[i];
    }
    return output;
  }

}
