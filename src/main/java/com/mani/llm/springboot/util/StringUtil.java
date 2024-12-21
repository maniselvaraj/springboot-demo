
/**
 * Utility class for string related operations.
 */
public class StringUtil {

    /**
     * Checks if the input string is a valid non-empty string.
     * Returns true if the input string is not null and not empty after trimming.
     *
     * @param input The input string to validate
     * @return true if the input string is valid, false otherwise
     */
    public static boolean isValidString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
