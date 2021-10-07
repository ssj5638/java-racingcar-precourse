package racinggame.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {

    Cars cars = new Cars("uluru,dobby,aveen");

    @Test
    void 입력받은_자동차이름_경주리스트_만들기() {
        assertEquals(3, cars.getCars().size());
        assertEquals("uluru", cars.getCars().get(0).name);
        assertEquals("dobby", cars.getCars().get(1).name);
        assertEquals("aveen", cars.getCars().get(2).name);
    }

    @Test
    void 최종_우승자_리스트_1명() {
        // uluru 만 한 번 이동
        cars.getCars().get(0).move(5);
        cars.getCars().get(1).move(3);
        cars.getCars().get(2).move(0);

        assertEquals("uluru", String.join(",", cars.getWinners()));
    }

    @Test
    void 최종_우승자_리스트_2명() {
        // uluru, dobby 한 번씩 이동
        cars.getCars().get(0).move(5);
        cars.getCars().get(1).move(6);
        cars.getCars().get(2).move(0);

        assertEquals("uluru,dobby", String.join(",", cars.getWinners()));
    }
}
