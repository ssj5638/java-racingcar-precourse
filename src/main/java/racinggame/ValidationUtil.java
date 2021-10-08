package racinggame;

public class ValidationUtil {
    public static boolean validCarNameLength(String carName) {
        return carName.length() < 6;
    }

    public static boolean validCountOfRacing(String count) {
        return count.matches("^[0-9]+$");
    }
}
