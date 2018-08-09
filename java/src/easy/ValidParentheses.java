package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
 * correct order. Note that an empty string is also considered valid.
 * <p>
 * Input: "([)]" Output: false Input: "()[]{}" Output: true
 */
class ValidParentheses {

  public static void main(String[] args) {
    System.out.println("([)]: " + isValid("([)]"));
    System.out.println("[{}]: " + isValid("[{}]"));
  }

  private static boolean isValid(String s) {
    List<Character> characterList = new ArrayList<>();
    for (char c : s.toCharArray()) {
      if (characterList.size() == 0 ||
          characterList.get(characterList.size() - 1) != getPartner(c)) {
        characterList.add(c);
      } else {
        characterList.remove(characterList.size() - 1);
      }
    }
    return characterList.isEmpty();
  }

  private static char getPartner(char s) {
    switch (s) {
      case '}':
        return '{';
      case ']':
        return '[';
      case ')':
        return '(';
    }
    return ' ';
  }
}
