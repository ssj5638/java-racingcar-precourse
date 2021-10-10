package racinggame.util;

import java.util.Arrays;

public class ValidationUtil {
    public static boolean validCarNameLength(String carNames) {
        return Arrays.stream(carNames.split(","))
                .allMatch(name -> name.length() < 6);
    }

    public static boolean validCountOfRacing(String count) {
        return count.matches("^[0-9]+$");
    }
}
