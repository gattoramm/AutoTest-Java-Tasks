package part03_Custom_Hamcrest_Matchers.practice14_custom_matchers_AlphaNumeric;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static part03_Custom_Hamcrest_Matchers.practice14_custom_matchers_AlphaNumeric.AlphaNumeric.alphaNumeric;

public class Runner1 {
    @Test
    public void test1() {
        assertThat("apple", is(alphaNumeric()));
    }

    @Test
    public void test2() {
        assertThat("123xyz", is(alphaNumeric()));
    }

    @Test
    public void test3() {
        assertThat("1-2-3", is(not(alphaNumeric())));
    }

    @Test
    public void test4() {
        assertThat("", is(not(alphaNumeric())));
    }
}
