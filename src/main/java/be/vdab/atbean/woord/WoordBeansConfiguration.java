package be.vdab.atbean.woord;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WoordBeansConfiguration {
    @Bean
    WoordService woordService(){
        return new WoordService();
    }
}
