package practice2_assertTrue_assertFalse;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class assertTrue_assertFalse {
    int x = 2;
    int y = 2;
    int z = 3;

    boolean a = (x == y);
    boolean b = (y == z);

    @Test
    public void test1() {
        assertTrue(a);
    }

    @Test
    public void test2() {
        assertFalse(b);
    }
}
