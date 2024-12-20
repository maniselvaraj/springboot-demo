
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main controller for handling LLM requests.
 */
@RestController
public class LLMMainController {

    /**
     * Handles the index endpoint.
     * @return a greeting message
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot Test Project for LLM refactoring!";
    }

    /**
     * Checks if the input string has unique characters.
     * @param my_string the input string to check
     * @return true if the string has unique characters, false otherwise
     */
    @GetMapping("/v1/unique_string/{my_string}")
    public Boolean checkIfStringHasUniqueCharacters(@PathVariable("my_string") String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
