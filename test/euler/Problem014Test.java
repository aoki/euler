package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem014Test {

  @Test
  public void 答え合わせ() {
    assertThat(Problem014.compute(999999), is(837799));
  }

}
