package util;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

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

  /**
   * 指定された引数を素因数分解し，素因数が格納されたArrayListを返す
   * @param dividend
   * @return 素因数が格納されたArrayList
   */
  public static ArrayList<Long> getFactorizationArray( long dividend ) {
    ArrayList<Long> primes = new ArrayList<Long>();
    long max = (long)Math.floor( Math.sqrt( dividend ) );
    for (long i=2; i<=max; i++) {
      while (dividend%i == 0) {
        primes.add(i);
        dividend /= i;
      }
      if (dividend == 1) return primes;
    }
    primes.add(dividend);
    return primes;
  }

  /**
   * 引数で渡されたArrayListに含まれている重複要素をカウントする
   * @param factors
   * @return キーに要素，値に重複した個数が格納されたMap
   */
  public static HashMap<Long, Integer> countDuplication(ArrayList<Long> factors) throws IllegalArgumentException {
    if (factors.size() == 0 ) throw new IllegalArgumentException("引数のArrayListのサイズが0です");

    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for (Long e: factors) {
      if (!map.containsKey(e)) {
        map.put(e, 1);
      } else {
        map.put(e, map.get(e) + 1);
      }
    }
    return map;
  }

  public static ArrayList<Long> getDivisorArray( long dividend ) {
    if (dividend == 0) {
      ArrayList<Long> zero = new ArrayList<Long>();
      zero.add(0L);
      return zero;
    }
    if (dividend == 1) {
      ArrayList<Long> one = new ArrayList<Long>();
      one.add(1L);
      return one;
    }
    ArrayList<Long> divisors = getFactorizationArray(dividend);
    divisors.add(0, 1L);
    return divisors;
  }

}
