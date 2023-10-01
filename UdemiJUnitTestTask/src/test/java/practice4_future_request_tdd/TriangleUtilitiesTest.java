package practice4_future_request_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TriangleUtilitiesTest {
    @Test
    public void testIsEquilateral() {
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 4));
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 3));
        assertTrue(TriangleUtilities.isEquilateral(4, 4, 4));
    }
}
