import java.lang.IllegalArgumentException;

public class Problem009 {
  
  public static boolean isPita(int a, int b, int c) {
    return ((a*a + b*b == c*c) && (a < b) && (b < c));
  }

  public static int getSum(int[] a) {
    int sum = 0;
    for (int i=0; i<a.length; i++){
      sum += a[i];
    }
    return sum;
  }
    public static int[] getLPita(int[] b, int l) {
        int[] a = b.clone();
        for (int i=0; i<a.length; i++){
            a[i] *= l;
        }
        return a;
    }

  
  public static void main(String[] args) {
    int[] pita = {0,0,0};

    for (int m=2; getSum(pita)<1000 ;m++) {
        for(int n=1; n<m; n++) {
            if (m%2 == n%2) continue;
            pita = getPita(n, m);
            System.out.println((pita[0]) + ", " + (pita[1]) + ", " + (pita[2])+ " = " + getSum(pita) );

            int[] lpita ={0,0,0};
            //aaa(pita)
            for(int l=1; getSum(lpita)<1000; l++) {
                lpita = getPita(n, m, l);
                if(getSum(lpita) ==1000){
                    System.out.println("\t" + (lpita[0]) + ", " + (lpita[1]) + ", " + (lpita[2]));
                    System.out.println("\t" + (lpita[0] * lpita[1] *lpita[2]) );
                }
            }

        }
    }

  }
  public void aaa(int m, int n) {
      int[] lpita ={m, n, 0};

      for(int l=1; getSum(lpita)<1000; l++) {
          lpita = getPita(n, m, l);
          if(getSum(lpita) ==1000){
              System.out.println("\t" + (lpita[0]) + ", " + (lpita[1]) + ", " + (lpita[2]));
              System.out.println("\t" + (lpita[0] * lpita[1] *lpita[2]) );
          }
      }
  }

//  public static boolean isAns(int[] a) {
//    return (getSum(lpita) == 1000);
//  }

  public static int[] getPita(int n, int m, int l) {
    int[] a = {(m*m - n*n)*l, (2 * m * n)*l, (m*m + n*n)*l};
    return a;
  }

  public static int[] getPita(int n, int m) {
    return getPita(n, m, 1);
  }
  
  
}