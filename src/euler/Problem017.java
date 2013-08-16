package euler;

import java.util.HashMap;
import java.util.Map;

public class Problem017 {
  /**
   * Problem17 数字の文字数
   * 1 から 5 までの数字を英単語で書けば one, two, three, four, five であり, 全部で 3 + 3 + 5 + 4 + 4 = 19 の文字が使われている.
   * では 1 から 1000 (one thousand) までの数字をすべて英単語で書けば, 全部で何文字になるか.
   * 注: 空白文字やハイフンを数えないこと. 例えば, 342 (three hundred and forty-two) は 23 文字, 115 (one hundred and fifteen) は20文字と数える. なお, "and" を使用するのは英国の慣習.
   * @param number
   * @return
   */

  private static Map<Integer, String> wordMap = new HashMap<Integer, String>();

  public static int compute(int max) {
    initWordMap();
    String str = "";
    for (int i = 1; i<=max; i++) {
      str += getEng(i);
    }

    return str.length();
  }

  static String getEng(int x) {
    if (x < 10 || (x % 10 == 0 && x < 100)) {
      return wordMap.get(x);
    }

    if (x > 10 && x < 20) {
      switch (x) {
      case 11: return "eleven";
      case 12: return "twelve";
      case 13: return "thirteen";
      case 15: return "fifteen";
      case 18: return "eighteen";
      }
      return wordMap.get(x-10)+"teen";
    }

    if (x < 100) {
      return wordMap.get((int)Math.floor(x/10)*10) + wordMap.get(x%10);
    }

    if (x%100 == 0 && x < 1000) {
      return wordMap.get((int)Math.floor(x/100)) + "hundred";
    }

    if (x < 1000) {
      return wordMap.get((int)Math.floor(x/100)) + "hundredand" + getEng(x%100);
    }

    return "onethousand";
  }

  static void initWordMap() {
    // Enumとかにできそう
    wordMap.put(1, "one");
    wordMap.put(2, "two");
    wordMap.put(3, "three");
    wordMap.put(4, "four");
    wordMap.put(5, "five");
    wordMap.put(6, "six");
    wordMap.put(7, "seven");
    wordMap.put(8, "eight");
    wordMap.put(9, "nine");
    wordMap.put(10, "ten");
    wordMap.put(20, "twenty");
    wordMap.put(30, "thirty");
    wordMap.put(40, "forty");
    wordMap.put(50, "fifty");
    wordMap.put(60, "sixty");
    wordMap.put(70, "seventy");
    wordMap.put(80, "eighty");
    wordMap.put(90, "ninety");
  }

  public static void main(String[] args) {
    long start = System.nanoTime();
    int ans = compute(1000);
    long stop = System.nanoTime();

    System.out.println( "Answer is " + ans + ".");
    System.out.println("Time: " + (stop - start) + " ns");

  }
}
