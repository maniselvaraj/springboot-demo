public class StringUtil {

    /**
     * Checks if the input string is a valid non-null and non-empty string.
     * 
     * @param input the input string to validate
     * @return true if the input is a valid string, false otherwise
     */
    public static boolean isValidString(String input) {
        if (input == null || input.equals("null")) {
            return false;
        }

        String trimmed = input.trim();
        return !trimmed.isEmpty();
    }
}