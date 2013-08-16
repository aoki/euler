package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Problem016Test {

  @Test
  public void 指数が15の時26を返す() {
    assertThat(Problem016.compute(15), is(BigInteger.valueOf(26)));
  }

  @Test public void 答えあわせ() {
    assertThat(Problem016.compute(1000), is(BigInteger.valueOf(1366)));
  }

}
