public class Problem006 {

  public static int compute(int max) {
    int powerSum = 0;
    int sumPower = 0;
    for (int i=0; i<=max; i++) {
      powerSum += i*i;
      sumPower += i;
    }
    sumPower *= sumPower;

    return Math.abs(sumPower - powerSum);
  }

  public static void main(String[] args) {
        System.out.println("Answer is " + compute(100) + ".");
  }

}