package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class UtilTest {

  @Test
  public void sumに配列を渡すと総和が取得できる() {
    ArrayList<Long> array = new ArrayList<Long>();
    array.add(1L);
    array.add(2L);
    array.add(3L);
    array.add(4L);
    array.add(5L);
    assertThat(Util.sum(array), is(15L));
  }

  @Test
  public void getFactorizationArrayに整数を渡すと素因数分解された配列が取得できる() {
    ArrayList<Long> factors = new ArrayList<Long>();
    factors = Util.getFactorizationArray(0L);
    assertThat(factors.toString(), is("[0]"));
    factors = Util.getFactorizationArray(1L);
    assertThat(factors.toString(), is("[1]"));
    factors = Util.getFactorizationArray(3L);
    assertThat(factors.toString(), is("[3]"));
    factors = Util.getFactorizationArray(6L);
    assertThat(factors.toString(), is("[2, 3]"));
    factors = Util.getFactorizationArray(15L);
    assertThat(factors.toString(), is("[3, 5]"));
    factors = Util.getFactorizationArray(21L);
    assertThat(factors.toString(), is("[3, 7]"));
    factors = Util.getFactorizationArray(28L);
    assertThat(factors.toString(), is("[2, 2, 7]"));
  }

  @Test
  public void getDupulicationにArrayListを渡すと重複をカウントしたMapが返ってくる() {
    ArrayList<Long> factors = new ArrayList<Long>();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();

    factors = Util.getFactorizationArray(3L);
    map = Util.countDuplication(factors);
    assertThat(map.get(3L), is(1));

    factors = Util.getFactorizationArray(6L);
    map = Util.countDuplication(factors);
    assertThat(map.get(2L), is(1));
    assertThat(map.get(3L), is(1));

    factors = Util.getFactorizationArray(28L);
    map = Util.countDuplication(factors);
    assertThat(map.get(2L), is(2));
    assertThat(map.get(7L), is(1));
  }

}
