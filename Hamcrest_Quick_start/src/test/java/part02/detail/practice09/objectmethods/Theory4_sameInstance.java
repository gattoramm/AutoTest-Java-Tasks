package part02.detail.practice09.objectmethods;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.sameInstance;

public class Theory4_sameInstance {
    @Test
    public void test1() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = list1;

        assertThat(list1, sameInstance(list2));
    }

}
