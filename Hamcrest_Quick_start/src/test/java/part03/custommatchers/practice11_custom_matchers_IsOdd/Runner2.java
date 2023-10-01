package part03.custommatchers.practice11_custom_matchers_IsOdd;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class Runner2 {
    @Test
    public void test1() {
        Integer lhs = 5;
        assertThat(lhs, IsOdd.isOdd());
    }
}
