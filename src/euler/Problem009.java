package euler;


public class Problem009 {

  public static void main(String[] args) {
    System.out.println(compute(1000));
  }

  public static int getSum(int[] a) {
    int sum = 0;
    for (int i=0; i<a.length; i++){
      sum += a[i];
    }
    return sum;
  }

  public static int compute(int target) {
    int[] pita = {0,0,0};

    for (int m = 2; getSum(pita) < target; m++) {
      for (int n = 1; n < m; n++) {
        if (m % 2 == n % 2) continue;

        int[] lpita = { 0, 0, 0 };
        for (int l = 1; getSum(lpita) < target; l++) {
          lpita = getPita(n, m, l);
          if (getSum(lpita) == target) {
            System.out.println("\t" + (lpita[0]) + ", " + (lpita[1]) + ", " + (lpita[2]));
            return (lpita[0] * lpita[1] * lpita[2]);
          }
        }
      }
    }
    return 0;
  }

  public static int[] getPita(int n, int m, int l) {
    int[] a = {(m*m - n*n)*l, (2 * m * n)*l, (m*m + n*n)*l};
    return a;
  }

  public static int[] getPita(int n, int m) {
    return getPita(n, m, 1);
  }

}