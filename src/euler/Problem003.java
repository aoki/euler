package euler;

import java.util.ArrayList;

public class Problem003 {

  public static long compute( long dividend ) {
    double max = Math.sqrt( (double)dividend );
    for (long i=2; i<=max; i++) {
      while (dividend%i == 0) dividend /= i;
      if (dividend == 1) return i;
    }
    return dividend;
  }

  // for Problem 4
  public static ArrayList<Double> getPrimes( double dividend ) {
    ArrayList<Double> primes = new ArrayList<Double>();
    double max = Math.sqrt( dividend );
    for (long i=2; i<=max; i++) {
      while (dividend%i == 0) {
        primes.add((double)i);
        dividend /= i;
      }
      if (dividend == 1) return primes;
    }
    primes.add(dividend);
    return primes;
  }

  public static void main(String[] args) {
    System.out.println(Problem003.compute(600851475143L));
  }
}
