
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling requests related to LLM operations.
 */
@RestController
public class LLMMainController {

    /**
     * Handles the GET request for the index page.
     * @return a greeting message for the Spring Boot Test Project for LLM refactoring.
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot Test Project for LLM refactoring!";
    }

    /**
     * Checks if a given string has unique characters.
     * @param str the string to be checked for unique characters
     * @return true if the string has all unique characters, false otherwise
     */
    @GetMapping("/v1/unique_string/{my_string}")
    public Boolean checkIfStringHasUniqueCharacters(@PathVariable("my_string") String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
