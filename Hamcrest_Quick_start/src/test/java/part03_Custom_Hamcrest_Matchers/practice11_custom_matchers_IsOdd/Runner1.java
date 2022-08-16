package part03_Custom_Hamcrest_Matchers.practice11_custom_matchers_IsOdd;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static part03_Custom_Hamcrest_Matchers.practice11_custom_matchers_IsOdd.IsOdd.isOdd;

public class Runner1 {
    @Test
    public void test1() {
        Integer lhs = 5;
        assertThat(lhs, isOdd());
    }
}
