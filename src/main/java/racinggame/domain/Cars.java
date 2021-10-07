package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

import static nextstep.utils.Randoms.pickNumberInRange;

public class Cars {

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
            car.move(pickNumberInRange(0, 9));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
