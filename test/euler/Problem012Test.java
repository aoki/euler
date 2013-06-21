package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem012Test {

  @Test
  public void 答え合わせ() {
    assertThat(Problem012.compute(500), is(76576500L));
  }

}
