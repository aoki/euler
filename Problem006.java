public class Problem006 {
  
  public static void compute(int max) {
    int powerSum = 0;
    int sumPower = 0;
    int ans = 0;
    for (int i=0; i<=max; i++) {
      powerSum += i*i;
      sumPower += i;
    }
    sumPower *= sumPower;
		
    ans = sumPower - powerSum;
    
    System.out.println("Answer is " + ans);
  }
  
  public static void main(String[] args) {
    compute(100);
  }
  
}