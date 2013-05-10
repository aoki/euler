package util;

import java.util.ArrayList;

public class Util {

  /**
   * ArrayList<Long>の総和を返す
   * @param array<Long>
   * @return 総和
   */
  public static long sum(ArrayList<Long> array) {
    long sum = 0;
    for (long x: array) sum += x;
    return sum;
  }

  /**
   * 引数で指定した値以下の素数が格納されたArrayListを返す
   * @param max
   * @return 素数が格納されたArrayList
   */
  public static ArrayList<Long> getPrimes(long max) {
    ArrayList<Long> primes = new ArrayList<Long>();
    primes.add(2L);
    for (long i=3; primes.get(primes.size()-1)<max; i+=2) {
      if( isPrime(i, primes) ) primes.add(i);
    }
    primes.remove(primes.size()-1);
    return primes;
  }

  /**
   * 素数かであるか判定したい値xと既知素数のArrayListを入力とし，
   * xが素数であるかどうかのbooleanを返す
   * @param x
   * @param primes
   * @return 素数: true, 非素数: false
   */
  public static boolean isPrime(long x, ArrayList<Long> primes) {
    for (long p: primes) {
      if (p > Math.sqrt(x)) return true;
      if (x % p == 0) return false;
    }
    return true;
  }

}
