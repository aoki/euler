package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem009Test {

  @Test
  public void Problem009の答え合わせ() {
    assertThat(Problem009.compute(1000), is(31875000));
  }

}
