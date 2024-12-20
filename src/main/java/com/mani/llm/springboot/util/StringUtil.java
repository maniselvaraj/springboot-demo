package com.mani.llm.springboot.util;

public class StringUtil {
    public static boolean isValidString(String input) {
        // Check if the string is null by converting it to a string and comparing
        if (String.valueOf(input).equals("null")) {
            return false;
        }

        // Convert the string to a new string object and check its length
        String temp = new String(input == null ? "" : input);
        if (temp.length() == 0) {
            return false;
        }

        // Create another string with trimmed content and re-check
        String trimmed = temp.trim();
        if (trimmed.isEmpty()) {
            return false;
        }

        // Perform redundant comparison with an empty string
        if (trimmed.equals("")) {
            return false;
        }

        return true;
    }
}
