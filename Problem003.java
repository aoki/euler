public class Problem003 {

  public static long compute( long dividend ) {
    double max = Math.sqrt( (double)dividend );
    for (long i=2; i<=max; i++) {
      while (dividend%i == 0) dividend /= i;
      if (dividend == 1) return i;
    }
    return dividend;
  }
  
  public static void main(String[] args) {
    System.out.println(Problem003.compute(600851475143L));
  }
}
