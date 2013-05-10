package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem010Test {

  @Test
  public void 例題の答え合わせ() {
    assertThat(Problem010.compute(10L), is(17L));
  }

  @Test
  public void 答え合わせ() {
    assertThat(Problem010.compute(2000000L), is(142913828922L));
  }

}
