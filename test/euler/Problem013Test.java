package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem013Test {

  @Test
  public void 答え合わせ() {
    assertThat(Problem013.compute("data/Problem013/data.txt"), is("5537376230"));
  }

}
