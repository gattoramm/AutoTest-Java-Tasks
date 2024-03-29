package part01.introduction.practice02_String_methods;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Theory02_emptyString_blankString_nullString {
    @Test
    void testEmptyString() {
        String s = "";
        assertThat(s, emptyString());
    }

    @Test
    void testBlankString() {
        String s = "   ";
        assertThat(s, blankString());
    }

    @Test
    void testEmptyOrNullString() {
        String s = "";
        String t = null;
        assertThat(s, emptyOrNullString());
        assertThat(t, emptyOrNullString());
    }

    @Test
    void testBlankOrNullString() {
        String s = "   ";
        String t = null;
        assertThat(s, blankOrNullString());
        assertThat(t, blankOrNullString());
    }
}
