package racinggame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static nextstep.utils.Randoms.pickNumberInRange;

public class Cars {
    private static final int RANGE_MIN_NUMBER = 0;
    private static final int RANGE_MAX_NUMBER = 9;

    private List<Car> cars;

    public Cars(String carNames) {
        this.cars = makeCarList(carNames);
    }

    private List<Car> makeCarList(String carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames.split(",")) {

            cars.add(new Car(carName, 0));
        }
        return cars;
    }

    public List<Car> racing() {
        for (Car car : cars) {
            car.move(pickNumberInRange(RANGE_MIN_NUMBER, RANGE_MAX_NUMBER));
        }
        return cars;
    }

    // TODO : 테스트를 위한 메소드 추후 삭제
    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinners() {
        Collections.sort(cars, (c1, c2) -> Integer.compare(c2.distance, c1.distance));
        int max = cars.get(0).distance;
        return cars.stream()
                .filter(car -> car.distance == max)
                .map(car -> car.name)
                .collect(Collectors.toList());
    }
}
