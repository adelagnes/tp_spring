package Spring_rendu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Spring_rendu.model") // Spécifie où se trouvent les entités JPA
@EnableJpaRepositories(basePackages = "Spring_rendu.repository") // Spécifie où se trouvent les repositories
public class SpringRenduApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRenduApplication.class, args);
    }
}
