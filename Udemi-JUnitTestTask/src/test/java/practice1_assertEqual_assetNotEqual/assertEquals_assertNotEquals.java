package practice1_assertEqual_assetNotEqual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;

public class assertEquals_assertNotEquals {
    int x = 2;
    int y = 2;
    int z = 3;

    @Test
    public void test1() {
        assertEquals(x, y);
    }

    @Test
    public void test2() {
        assertNotEquals(y, z);
    }
}
