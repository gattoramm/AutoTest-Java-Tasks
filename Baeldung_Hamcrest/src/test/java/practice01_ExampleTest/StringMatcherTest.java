package practice01_ExampleTest;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class StringMatcherTest {
    @Test
    public void twoStringEqual() {
        String a = "foo";
        String b = "foo";
        assertThat(a, equalToIgnoringCase(b));
    }
}
