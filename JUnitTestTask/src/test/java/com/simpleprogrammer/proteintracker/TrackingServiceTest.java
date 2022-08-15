package com.simpleprogrammer.proteintracker;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;


public class TrackingServiceTest {
    private TrackingService service;

    @BeforeClass
    public static void before() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void after() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        service = new TrackingService();
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    @Category({GoodTestCategory.class, BadCategory.class})
    public void NewTrackingServiceTotalIsZero() {
        assertEquals("Tracking service total was not zero", 0, service.getTotal());
    }

    @Test
//    @Ignore
    @Category(GoodTestCategory.class)
    public void WhenAddingProteinTotalIncreasesByThatAmount() {
        service.addProtein(10);
        assertEquals(10, service.getTotal());
        assertThat(service.getTotal(), is(10));

        assertThat(service.getTotal(), allOf(is(10), instanceOf(Integer.class)));
    }

    @Test
    @Category(GoodTestCategory.class)
    public void WhenRemovingProteinTotalRemainsZero() {
        service.removeProtein(10);
        assertEquals(0, service.getTotal());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void WhenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException{
        thrown.expect(InvalidGoalException.class);
//        thrown.expectMessage("Goal was less than zero");
        thrown.expectMessage(containsString("Goal"));
        service.setGoal(-5);
    }

    @Rule
    public Timeout timeout = new Timeout(20);

    @Test
    public void BadTest() {
        for (int i = 0; i < 10000000; i++)
            service.addProtein(1);
    }
}
