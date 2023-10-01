package part03.custommatchers.practice12_custom_matchers_Sum;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static part03.custommatchers.practice12_custom_matchers_Sum.Sum.sum;

public class Runner1 {
    @Test
    public void test1() {
        Integer lhs = 6;
        assertThat(lhs, sum(1, 2, 3));
    }
}
