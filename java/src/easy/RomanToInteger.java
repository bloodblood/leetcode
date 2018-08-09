package easy;

import java.util.HashMap;

/**
 * Input: "IV" Output: 4
 */
class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("IV"));
  }

  private static int romanToInt(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    char[] data = s.toCharArray();
    int ans = 0;
    for (int i = 0; i < data.length - 1; i++) {
      if (map.get(data[i + 1]) > map.get(data[i])) {
        ans -= map.get(data[i]);
      } else {
        ans += map.get(data[i]);
      }
    }
    ans += map.get(data[data.length - 1]);
    return ans;
  }
}
