package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {

    @Test
    void 입력받은_자동차이름_경주리스트_만들기() {
        Cars cars = new Cars("hello,dobby,viva");
        assertEquals(3, cars.getCars().size());
        assertEquals("hello", cars.getCars().get(0).name);
        assertEquals("dobby", cars.getCars().get(1).name);
        assertEquals("viva", cars.getCars().get(2).name);
    }
}
