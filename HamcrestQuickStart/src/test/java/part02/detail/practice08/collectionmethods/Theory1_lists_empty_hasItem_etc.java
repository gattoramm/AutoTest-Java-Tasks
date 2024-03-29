package part02.detail.practice08.collectionmethods;

import org.junit.*;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory1_lists_empty_hasItem_etc {
    @Test
    public void test1() {
        List<Integer> list = null;
        assertThat(list, nullValue());

        list = new ArrayList<>();
        assertThat(list, empty());

        list = Arrays.asList(3, 1, 2, 4);
        assertThat(list, hasSize(4));
        assertThat(list, hasItem(3));
        assertThat(list, hasItems(1, 3));

        assertThat(list, contains(3, 1, 2, 4));
        assertThat(list, containsInAnyOrder(  1, 2, 3, 4));
    }
}
