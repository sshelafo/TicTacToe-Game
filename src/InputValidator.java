public class InputValidator {
    public static boolean isValidCoordinate(int coord) {
        // Fixed: now correctly validates 1-3 range
        return coord >= 1 && coord <= 3;
    }
}
