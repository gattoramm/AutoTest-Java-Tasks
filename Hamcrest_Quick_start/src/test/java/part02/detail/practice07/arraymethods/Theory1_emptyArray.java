package part02.detail.practice07.arraymethods;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyArray;

public class Theory1_emptyArray {
    @Test
    public void test1() {
        String[] array = {};
        assertThat(array, emptyArray());

        Integer[] numbers = {};
        assertThat(numbers, emptyArray());

        Car[] cars = {};
        assertThat(cars, emptyArray());
    }
}

class Car {

}
