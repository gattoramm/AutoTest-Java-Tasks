package com.simpleprogrammer.proteintracker;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class TrackingServiceTheories {
    @DataPoints
    public static int[] data() {
        return new int[] {
                1, 5, 10, 15, 20, 50, -4
//                1, 5, 10, 15, 20, 50, 4
        };
    }

    @Theory
    public void positiveValuesShouldAlwaysHavePositiveTotals(int value) {
        TrackingService service = new TrackingService();
        service.addProtein(value);
        Assume.assumeTrue(value > 0);

        assertTrue(service.getTotal() > 0);
    }
}
