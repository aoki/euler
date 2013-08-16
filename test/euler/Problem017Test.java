package euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Problem017Test {

  @Test
  public void 入力が5のとき19を返す() {
    assertThat(Problem017.compute(5), is(19));
  }

  @Test
  public void 答え合わせ() {
    assertThat(Problem017.compute(1000), is(21124));
  }

}
