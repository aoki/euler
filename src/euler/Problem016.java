package euler;

import java.math.BigInteger;

public class Problem016 {

  /**
   * Problem16 べき乗の数字和
   * 2^15 = 32768 であり, これの各桁の和は 3 + 2 + 7 + 6 + 8 = 26 となる.
   * 同様にして, 2^1000 の各桁の和を求めよ.
   * @param number
   * @return
   */
  public static BigInteger compute(int exp) {
    BigInteger x = new BigInteger("2");
    String xe = x.pow(exp).toString();
    BigInteger sum = BigInteger.ZERO;

    for (int i = 0; i<xe.length(); i++) {
      sum = sum.add(BigInteger.valueOf(xe.charAt(i)-'0'));
    }
    return sum;
  }

  public static void main(String[] args) {
    long start = System.nanoTime();
    BigInteger ans = compute(1000);
    long stop = System.nanoTime();

    System.out.println( "Answer is " + ans + ".");
    System.out.println("Time: " + (stop - start) + " ns");

  }
}
