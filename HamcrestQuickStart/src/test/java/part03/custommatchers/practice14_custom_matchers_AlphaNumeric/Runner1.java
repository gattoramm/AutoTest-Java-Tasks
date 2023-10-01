package part03.custommatchers.practice14_custom_matchers_AlphaNumeric;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class Runner1 {
    @Test
    public void test1() {
        MatcherAssert.assertThat("apple", Matchers.is(AlphaNumeric.alphaNumeric()));
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat("123xyz", Matchers.is(AlphaNumeric.alphaNumeric()));
    }

    @Test
    public void test3() {
        MatcherAssert.assertThat("1-2-3", Matchers.is(Matchers.not(AlphaNumeric.alphaNumeric())));
    }

    @Test
    public void test4() {
        MatcherAssert.assertThat("", Matchers.is(Matchers.not(AlphaNumeric.alphaNumeric())));
    }
}
