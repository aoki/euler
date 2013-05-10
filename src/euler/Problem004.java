package euler;

import java.util.ArrayList;

public class Problem004 {

  public static int compute(int num) {
    for (;num >= 100*100; num--) {
      // Check Kaibun
      if (! checkKaibun(String.valueOf(num))) continue;

      // Get prime numbers
      ArrayList<Double> primes = Problem003.getPrimes((double)num);

      // Check bounds
      if ( primes.get(primes.size()-1) < 100 || primes.get(primes.size()-1) > 999 ) {
        continue;
      }

      // Check answer
      if (isAnswer(primes)) return num;
    }
    return -1;
  }

  public static boolean isAnswer(ArrayList<Double> primes) {
    double prod = primes.remove(primes.size()-1);
    while ( (primes.size() != 0) && (prod * primes.get(0) < 1000) ) {
      prod *= primes.remove(0);
    }

    double prod2 = primes.remove(primes.size()-1);
    while ( (primes.size() != 0) && (prod2 * primes.get(0) < 1000) ) {
      prod2 *= primes.remove(0);
    }

    //Check number of E
    if (primes.size() == 0){
      System.out.println("Product: " + prod + "*" + prod2);
      return true;
    }
    return false;
  }

  // Check Kaibun
  static boolean checkKaibun(String str) {
    for (int l = str.length()-1, s = 0; l >= s; l--, s++) {
      if (str.charAt(l) != str.charAt(s)) return false;
    }
    System.out.println(str + " is Kaibun!");
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Answer is " + compute(999*999) + ".");
  }

}