package part02.detail.practice09.objectmethods;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

public class Theory3_instanceOf_isA {
    @Test
    public void test1() {
        Car car = new Car();
        Convertible convertible = new Convertible();

        assertThat(car, instanceOf(Vehicle.class));
        assertThat(car, isA(Car.class));
        assertThat(convertible, isA(Vehicle.class));
        assertThat(convertible, isA(Car.class));
        assertThat(convertible, isA(Convertible.class));
    }
}

interface Vehicle {
    public void move();
}

class Car implements Vehicle {
    public void move() {
    }
}

class Convertible extends Car {
    boolean isTopDown;

    public boolean isTopDown() {
        return isTopDown;
    }
}
