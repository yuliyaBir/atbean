package be.vdab.atbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Bean
    public KwadraatService kwadraat() {
        return new KwadraatService();
    }
}
