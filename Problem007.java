import java.util.ArrayList;

public class Problem007 {

  public static int compute(int max) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    primes.add(2);
    for (int i=3; primes.size()<max; i++) {
      if( isPrime(i, primes) ) primes.add(i);
    }

    return primes.get(primes.size()-1);
  }

  public static boolean isPrime(int x, ArrayList<Integer> primes) {
    for (int p: primes) {
      if (x % p == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Answer is " + compute(10001) + ".");
  }
}