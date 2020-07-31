package guru.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml") //ask spring to look for this file on the classpath
public class JokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeappApplication.class, args);
	}
}
