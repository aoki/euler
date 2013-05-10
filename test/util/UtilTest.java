package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilTest {

  @Test
  public void sumTest() {
    ArrayList<Long> array = new ArrayList<Long>();
    array.add(1L);
    array.add(2L);
    array.add(3L);
    array.add(4L);
    array.add(5L);
    assertThat(Util.sum(array), is(15L));
  }

}
