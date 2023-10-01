package part02.detail.practice07.arraymethods;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory2_arrayWithSize_etc {
    @Test
    public void test1() {
        String[] animals = {"alpaca", "bat", "cat"};
        assertThat(animals, arrayWithSize(3));

        assertThat(animals, hasItemInArray("bat"));

        assertThat(animals, arrayContaining("alpaca", "bat", "cat"));

        assertThat(animals, arrayContainingInAnyOrder("alpaca", "cat", "bat"));
    }
}
