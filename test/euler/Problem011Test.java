package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem011Test {

  @Test
  public void 答え合わせ() {
    assertThat(Problem011.compute("data/Problem011/problem011.ssv"), is(70600674));
  }

  @Test
  public void sample01答え合わせ() {
    assertThat(Problem011.compute("data/Problem011/sample01.ssv"), is(256));
  }

  @Test
  public void sample02答え合わせ() {
    assertThat(Problem011.compute("data/Problem011/sample02.ssv"), is(9507960));
  }

}
