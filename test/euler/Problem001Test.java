package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem001Test {

  @Test
  public void 上限が10のとき23が出力される() {
    int actual = Problem001.compute(10);
    assertThat(actual, is(23));
  }

  @Test
  public void 上限が1000のとき23が出力される() {
    int actual = Problem001.compute(1000);
    assertThat(actual, is(233168));
  }

}
