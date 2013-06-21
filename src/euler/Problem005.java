package euler;

import java.util.ArrayList;

public class Problem005 {

  public static int compute(int max) {
    ArrayList<Double> factors = new ArrayList<Double>();
    ArrayList<Double> primes;

    for(int i=max; i>=2; i--) {
      primes = Problem003.getPrimes(i);
      System.out.println(primes.toString());
      for(double tmp: primes) factors.remove(tmp);
      factors.addAll(primes);
    }

    int ans = 1;
    for (double tmp: factors) ans *= tmp;

    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Answer is " + compute(20) + ".");
  }

}
