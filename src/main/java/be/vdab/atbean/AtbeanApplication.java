package be.vdab.atbean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtbeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtbeanApplication.class, args);
    }
    @Bean
    OpenAPI openAPI(){
        return new OpenAPI().info(new Info().title("Spelen met woorden en Rekenen").version("1.0.0").description("Berekenen maken en spelen met woorden"));
    }

}
