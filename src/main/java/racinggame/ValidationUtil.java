package racinggame;

public class ValidationUtil {
    public static boolean validCarNameLength(String carName) {
        return carName.length() < 6;
    }
}
