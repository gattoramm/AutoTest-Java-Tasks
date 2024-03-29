package part01.introduction.practice03_Number_methods;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory01_lessThan_etc {
    @Test
    public void test1() {
        assertThat(10, lessThan(20));
        assertThat(10, lessThanOrEqualTo(20));
        assertThat(10, equalTo(10));
        assertThat(10, greaterThanOrEqualTo(0));
        assertThat(10, greaterThan(0));
    }
}
