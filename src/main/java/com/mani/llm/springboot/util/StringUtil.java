public class StringUtil {

    /**
     * Method to check if the input string is a valid string.
     * A valid string is not null, not empty, and not just whitespace.
     *
     * @param input the input string to be validated
     * @return true if the input string is valid, false otherwise
     */
    public static boolean isValidString(String input) {
        // Check if the string is null
        if (input == null) {
            return false;
        }

        // Trim the input string and check if it is empty
        String trimmed = input.trim();
        return !trimmed.isEmpty();
    }
}