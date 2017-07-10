package spring.javabasedconfiguration;


import org.springframework.context.annotation.Bean;

public class WelcomeConfig {

    @Bean
    public Welcome welcome(){
        return new Welcome();
    }
}
