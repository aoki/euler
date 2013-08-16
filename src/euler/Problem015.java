package euler;

import java.math.BigInteger;

public class Problem015 {

  /**
   * Problem14 格子経路問題
   * 2×2 のマス目の左上からスタートした場合, 引き返しなしで右下にいくルートは 6 つある.
   * では, 20×20 のマス目ではいくつのルートがあるか.
   * @param number
   * @return
   */
  public static BigInteger compute(long x, long y) {
    // x方向にx移動，y方向にy移動．
    // x+yの置換に等しい．
    // ただし，x方向，y方向ともに順序は関係ないので，重複分を割る．
    BigInteger a = computePermutation(BigInteger.valueOf(x+y));
    BigInteger b = computePermutation(BigInteger.valueOf(x));
    if ( x == y) {
      return a.divide(b).divide(b);
    }
    BigInteger c = computePermutation(BigInteger.valueOf(y));
    return a.divide(b).divide(c);
  }

  public static BigInteger computePermutation(BigInteger x) {
    BigInteger tmp = BigInteger.ONE;
    for (BigInteger i = BigInteger.ONE; i.compareTo(x.add(BigInteger.ONE))<0; i=i.add(BigInteger.ONE)) {
      tmp = tmp.multiply(i);
    }
    return tmp;
  }

  public static void main(String[] args) {
    long start = System.nanoTime();
    BigInteger ans = compute(20L, 20L);
    long stop = System.nanoTime();

    System.out.println( "Answer is " + ans + ".");
    System.out.println("Time: " + (stop - start) + " ns");

  }
}
