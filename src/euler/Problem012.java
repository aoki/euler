package euler;

import java.util.HashMap;

import util.Util;

public class Problem012 {

  public static long compute(int n) {
    long sum = 0;
    // TODO: この汚いforをなんとかする
    for (int i = 1;; i++) {
      sum += i;
      // 約数の個数は(a^p)(b^q)(c^r)(d^s)のとき，(p+1)(q+1)(r+1)(s+1)となる
      // TODO: 関数に切り出す
      HashMap<Long, Integer> numOfFactorsMap = Util.countDuplication(Util.getFactorizationArray(sum));
      int numOfDivisor = 1;
      for (long k: numOfFactorsMap.keySet()) {
        numOfDivisor *= numOfFactorsMap.get(k)+1;
      }
      if (numOfDivisor >= n) return sum;
    }

  }

  public static void main(String[] args) {
    System.out.println("Answer is " + compute(500) + ".");
  }
}
