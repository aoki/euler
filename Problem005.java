import java.util.ArrayList;

public class Problem005 {

  public static void compute(int max) {
    ArrayList<Double> factors = new ArrayList<Double>();
    ArrayList<Double> primes;
    
    for(int i=max; i>=2; i--) {
      primes = Problem003.getPrimes(i);
      for(double tmp: primes) factors.remove(tmp);
      factors.addAll(primes);
    }
    
    double ans = 1;
    for (double tmp: factors) ans *= tmp;

    System.out.println("Answer is " + String.format("%09f", ans));
  }

  public static void main(String[] args) {
    compute(20);
  }

}
