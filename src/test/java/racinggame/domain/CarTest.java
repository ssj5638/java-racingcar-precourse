package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_거리() {
        Car car = new Car("dobby", 1);
        car.move(5);

        assertEquals(2, car.distance);
    }

}