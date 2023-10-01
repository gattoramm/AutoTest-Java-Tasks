package practice7_bugFix;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TriangleUtilitiesTest {
    @Test
    public void testIsIsosceless() {
        int sideA = 3;
        int sideB = 2;
        int sideC = 3;

        assertTrue(TriangleUtilities.isIsosceless(sideA, sideB, sideC));
    }
}
