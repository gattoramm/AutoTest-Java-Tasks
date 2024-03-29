package part02.detail.practice08.collectionmethods;

import org.junit.*;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory2_lists_anyOrder {
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(3, 1, 2);

        assertThat(list.get(0), equalTo(3));

        assertThat(list, everyItem(greaterThan(-1)));
        assertThat(list, everyItem(greaterThanOrEqualTo(1)));
        assertThat(list, everyItem(lessThan(10)));
        assertThat(list, everyItem(lessThanOrEqualTo(3)));
    }
}
