package part01.introduction.practice02_String_methods;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.*;

public class Theory01_startsWith_endsWith_containsString_equalTo {
    @Test
    void test1() {
        String s = "abc def";
        String t = "abc def";
        assertThat(s, startsWith("ab"));
        assertThat(s, endsWith("ef"));
        assertThat(s, containsString("c de"));
        assertThat(s, equalTo(t));
    }

    @Test
    void test2() {
        String s = "abcdef";
        String t = "aBCdef";
        assertThat(s, startsWithIgnoringCase("aB"));
        assertThat(s, endsWithIgnoringCase("dEF"));
        assertThat(s, containsStringIgnoringCase("BcD"));
        assertThat(s, equalToIgnoringCase(t));
    }
}
