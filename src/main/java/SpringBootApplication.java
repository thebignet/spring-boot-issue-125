import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootApplication {

    public static void main(String[] args) throws Exception {
        int exitValue = SpringApplication.exit(SpringApplication.run(SpringBootApplication.class, args));
        System.exit(exitValue);
    }
}
