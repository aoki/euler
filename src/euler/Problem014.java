package euler;

import java.util.HashMap;
import java.util.Map;

public class Problem014 {

  /**
   * Problem14 最長のコラッツ数列
   * 正の整数に以下の式で繰り返し生成する数列を定義する.
   * n → n/2 (n が偶数)
   * n → 3n + 1 (n が奇数)
   * 13からはじめるとこの数列は以下のようになる.
   * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
   * 13から1まで10個の項になる. この数列はどのような数字からはじめても最終的には 1 になると考えられているが, まだそのことは証明されていない(コラッツ問題)
   * さて, 100万未満の数字の中でどの数字からはじめれば最長の数列を生成するか.
   * 注意: 数列の途中で100万以上になってもよい
   * @param number
   * @return
   */
  public static int compute(int x) {
    if(x >= 1000000) {
      throw new IllegalArgumentException("Please enter the number of  less than one million.");
    }

    Map<Long, Integer> collatzCount = new HashMap<Long, Integer>();
    int maxX = 0;
    int maxCount = 0;

    for(int i=2; x>=i; i++) {
      int tmp = aa((long)i, collatzCount);
      //System.out.println(i + " count = " + tmp);
      collatzCount.put((long)i, tmp);
      if (maxCount < tmp) {
        maxCount = tmp;
        maxX = i;
      }
    }
    return maxX;
  }

  public static int aa(long n, Map<Long, Integer> collatzCount) {
    //System.out.println(n + " start");
    int counter = 1;
    while(n > 1) {
      //System.out.print(n + ",");
      if(collatzCount.containsKey(n)) {
        counter += collatzCount.get(n) - 1;
        //System.out.println();
        return counter;
      }

      counter++;
      if(n%2 == 0)  n /= 2;
      else          n = 3*n+1;
    }
    //System.out.println(1);
    return counter;
  }

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    int ans = compute(999999);
    long stop = System.currentTimeMillis();

    System.out.println( "Answer is " + ans + ".");
    System.out.println("Time: " + (stop - start) + " ms");

  }
}
