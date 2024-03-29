package part02.detail.practice09.objectmethods;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

public class Theory5_anything {
    @Test
    public void test1() {
        String s = "car";
        String t = null;
        List<Integer> list1 = null;
        List<Integer> list2 = new ArrayList<>();

        assertThat(100, anything());
        assertThat(null, anything());
        assertThat("hello", anything());
        assertThat(s, anything());
        assertThat(t, anything());
        assertThat(list1, anything());
        assertThat(list2, anything());

        assertThat("abc", is(anything()));
    }
}
