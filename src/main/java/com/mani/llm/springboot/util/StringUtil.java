public class StringUtil {

    /**
     * Check if the given input string is valid.
     * 
     * @param input the input string to be validated
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