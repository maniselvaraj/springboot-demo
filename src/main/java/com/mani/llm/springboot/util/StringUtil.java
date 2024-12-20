public class StringUtil {

    /**
     * Checks if the input string is valid by ensuring it is not null or empty after trimming.
     * 
     * @param input the input string to validate
     * @return true if the input string is valid, false otherwise
     */
    public static boolean isValidString(String input) {
        if (input == null || input.equals("null")) {
            return false;
        }

        String trimmed = input.trim();
        return !trimmed.isEmpty();
    }
}