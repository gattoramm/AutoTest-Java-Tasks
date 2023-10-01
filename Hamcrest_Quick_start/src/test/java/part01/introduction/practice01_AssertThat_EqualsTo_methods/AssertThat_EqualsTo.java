package part01.introduction.practice01_AssertThat_EqualsTo_methods;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.*;


public class AssertThat_EqualsTo {
    @Test
    void test1() {
        String s = "abc";
        assertThat(s.length(), equalTo(3));
        System.out.println("I print if the assert passes.");
    }

    @Test
    void test2() {
        String s = "abc";
        assertThat("my optional custom error message", s.length(), equalTo(3));
        System.out.println("I also print if the assert passes.");
    }
}
