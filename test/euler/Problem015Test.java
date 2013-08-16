package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Problem015Test {

  @Test
  public void 格子サイズが3x1のとき4が返ってくる() {
    assertThat(Problem015.compute(3, 1), is(BigInteger.valueOf(4)));
  }

  @Test
  public void 格子サイズが2x2のとき6が返ってくる() {
    assertThat(Problem015.compute(2, 2), is(BigInteger.valueOf(6)));
  }

  @Test
  public void 格子サイズが3x3のとき20が返ってくる() {
    assertThat(Problem015.compute(3, 3), is(BigInteger.valueOf(20)));
  }

  @Test
  public void 格子サイズが4x3のとき20が返ってくる() {
    assertThat(Problem015.compute(4, 3), is(BigInteger.valueOf(35)));
  }

  @Test
  public void 答えあわえ() {
    assertThat(Problem015.compute(20, 20), is(BigInteger.valueOf(137846528820L)));
  }

}
