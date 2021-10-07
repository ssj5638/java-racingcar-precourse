package racinggame;

import racinggame.domain.Car;
import racinggame.domain.Cars;

import java.util.Arrays;

import static nextstep.utils.Console.readLine;

public class RacingGame {

    private Cars cars;
    private boolean isReady;

    public void run() {
        isReady = false;
        
        readyCars();

        System.out.println("시도할회수는몇회인가요?");
        playRacing(Integer.parseInt(readLine()));

        System.out.println("실행 결과");
        System.out.println("최종 우승자는 " + String.join(",", cars.getWinners()) + " 입니다.");
    }

    // TODO : indent depth 줄이기
    private void readyCars() {
        String carNames = "";
        while (!isReady) {
            System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
            carNames = readLine();

            isReady = Arrays.stream(carNames.split(",")).allMatch(ValidationUtil::validCarNameLength);
            if (!isReady) {
                System.out.println("[ERROR]");
            }
        }

        cars = new Cars(carNames);
    }

    private void playRacing(int count) {
        for (int i = 0; i < count; i++) {
            cars.racing();
            printRacing();
        }
    }

    private void printRacing() {
        for (Car car : cars.getCars()) {
            System.out.println(car.name + " : " + makeDistance(car.distance));
        }
        System.out.println();
    }

    private String makeDistance(int distance) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

}
