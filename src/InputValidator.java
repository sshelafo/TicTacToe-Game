public class InputValidator {
    public static boolean isValidCoordinate(int coord) {
        // Bug: should be >= 1, not > 1
        return coord > 1 && coord <= 3;
    }
}
