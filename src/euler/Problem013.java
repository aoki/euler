package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem013 {

  private static BufferedReader bf;

  public static String compute(String filename) {
    BigInteger ans = BigInteger.ZERO;
    try {
      bf = new BufferedReader(
          new FileReader( new File(filename) )
      );

      String line;
      while((line = bf.readLine()) != null) {
        ans = ans.add(new BigInteger(line));
      }
      return ans.toString().substring(0,10);
    } catch(FileNotFoundException e) {
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
    return "NOT FOUND";
  }

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    System.out.println( "Answer is " + compute("data/Problem013/data.txt") + ".");
    long stop = System.currentTimeMillis();
    System.out.println("Time: " + (stop - start) + " ms");
  }


}
