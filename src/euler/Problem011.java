package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Problem011 {

  private static BufferedReader bf;

  public static int compute(String filename) {
    List<int[]> data = getData(filename);
    int windowSize = 4;
    int maxX = data.get(0).length;
    int maxY = data.size();

    int max = -1;
    int actual = -1;
    for (int y=0; y<maxY; y++) {
      for (int x=0; x<maxX; x++) {
        if (x <= maxX-windowSize) {
          actual = data.get(y)[x] * data.get(y)[x+1] * data.get(y)[x+2] * data.get(y)[x+3];
          if (max < actual) max = actual;
        }
        if (y <= maxY-windowSize) {
          actual = data.get(y)[x] * data.get(y+1)[x] * data.get(y+2)[x] * data.get(y+3)[x];
          if (max < actual) max = actual;
        }
        if (x <= maxX-windowSize && y <= maxY-windowSize) {
          actual = data.get(y)[x] * data.get(y+1)[x+1] * data.get(y+2)[x+2] * data.get(y+3)[x+3];
          if (max < actual) max = actual;
        }
        if (x <= maxX-windowSize && y >= windowSize-1 && y <= maxY-windowSize) {
          actual = data.get(y+windowSize-1)[x] * data.get(y+windowSize-2)[x+1] * data.get(y+windowSize-3)[x+2] * data.get(y+windowSize-4)[x+3];
          if (max < actual) max = actual;
        }
      }
    }

    return max;
  }

  public static List<int[]> getData(String filename) {
    List<int[]> data = new ArrayList<int[]>();

    try {
      File file = new File(filename);
      FileReader fr = new FileReader(file);
      bf = new BufferedReader(fr);

      String line;

      while((line = bf.readLine()) != null) {
        data.add( strToInt( line.split(" ") ) );
      }

    } catch(FileNotFoundException e) {
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }

    return data;
  }

  private static int[] strToInt(String[] split) {
    int[] intLine = new int[split.length];
    for (int i=0; i<split.length; i++) {
      intLine[i] = Integer.parseInt(split[i]);
    }
    return intLine;
  }

  public static void main(String[] args) {
    System.out.println("Answer is " + compute("data/Problem011/problem011.ssv") + "\n");
  }
}
