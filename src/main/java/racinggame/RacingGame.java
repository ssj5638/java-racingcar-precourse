package racinggame;

import racinggame.domain.Car;
import racinggame.domain.Cars;

import static nextstep.utils.Console.readLine;

public class RacingGame {
    private Cars cars;

    public void run() {
        readyCars();
        countOfRacing();
        System.out.println("실행 결과");
        System.out.println("최종 우승자는 " + String.join(",", cars.getWinners()) + " 입니다.");
    }

    // TODO : indent depth 줄이기
    private void readyCars() {
        boolean isReady = false;
        String carNames = "";

        while (!isReady) {
            System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
            carNames = readLine();

            isReady = ValidationUtil.validCarNameLength(carNames);
            if (!isReady) {
                System.out.println("[ERROR]");
            }
        }

        cars = new Cars(carNames);
    }

    private void countOfRacing() {
        boolean isPlaying = false;
        String count = "";
        while (!isPlaying) {
            System.out.println("시도할회수는몇회인가요?");
            count = readLine();

            isPlaying = ValidationUtil.validCountOfRacing(count);

            if (!isPlaying) {
                System.out.println("[ERROR]");
            }
        }
        playRacing(Integer.parseInt(count));
        System.out.println();
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
