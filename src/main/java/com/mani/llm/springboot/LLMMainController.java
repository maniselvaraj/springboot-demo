
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class contains endpoints for LLM main controller operations.
 */
@RestController
public class LLMMainController {

    /**
     * Endpoint to return a greeting message.
     *
     * @return a greeting message
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot Test Project for LLM refactoring!";
    }

    /**
     * Endpoint to check if a string has unique characters.
     *
     * @param str the input string
     * @return true if the string has unique characters, false otherwise
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
