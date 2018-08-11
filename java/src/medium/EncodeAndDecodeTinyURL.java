package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such as
 * http://tinyurl.com/4e9iAk.
 */
class EncodeAndDecodeTinyURL {

  private static List<String> database = new ArrayList<>();

  public static void main(String[] args) {
    String originalURL = "https://www.google.com";
    String originalURL2 = "https://www.baidu.com";
    String shortURL = encode(originalURL);
    String longURL = decode(shortURL);
    String shortURL2 = encode(originalURL2);
    String longURL2 = decode(shortURL2);
    System.out.println("equals: " + longURL.equals(originalURL));
    System.out.println("longURL: " + longURL);
    System.out.println("shortURL: " + shortURL);
    System.out.println("equals: " + longURL2.equals(originalURL2));
    System.out.println("longURL: " + longURL2);
    System.out.println("shortURL: " + shortURL2);
  }

  // Encodes a URL to a shortened URL.
  private static String encode(String longUrl) {
    if (!database.contains(longUrl)) {
      database.add(longUrl);
    }
    return String.valueOf(database.indexOf(longUrl));
  }

  // Decodes a shortened URL to its original URL.
  private static String decode(String shortUrl) {
    return database.get(Integer.parseInt(shortUrl));
  }
}
