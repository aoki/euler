package euler;

import java.util.ArrayList;

import util.Util;

public class Problem010 {

  public static void main(String[] args) {
    System.out.println("Answer is " + compute(2000000) + ".");
  }

  public static long compute(long max) {
    ArrayList<Long> primes = Util.getPrimes(max);
    return Util.sum(primes);
  }

}
