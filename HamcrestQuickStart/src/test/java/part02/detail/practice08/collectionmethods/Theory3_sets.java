package part02.detail.practice08.collectionmethods;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory3_sets {
    @Test
    public void test1() {
        Set<Integer> set = null;
        assertThat(set, nullValue());

        set = new HashSet<>();
        assertThat(set, empty());

        set.add(3); set.add(4); set.add(5);

        assertThat(set, hasSize(3));
        assertThat(set, hasItem(3));
        assertThat(set, hasItems(3, 4));
        assertThat(set, containsInAnyOrder(3, 4, 5));
    }
}
