
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * The Application class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication
public class Application {

    /**
     * The main method to run the Spring Boot application.
     * 
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Bean definition to provide a CommandLineRunner for inspecting beans provided by Spring Boot.
     * 
     * @param ctx The ApplicationContext
     * @return The CommandLineRunner instance
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
