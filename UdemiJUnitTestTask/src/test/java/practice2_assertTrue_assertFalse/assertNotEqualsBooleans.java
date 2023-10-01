package practice2_assertTrue_assertFalse;

import static org.junit.Assert.assertNotEquals;

import org.junit.*;

public class assertNotEqualsBooleans {
    int x = 2;
    int y = 2;
    int z = 3;

    boolean a = (x == y);
    boolean b = (y == z);

    @Test
    public void test3() {
        assertNotEquals(a, b);
    }
}
