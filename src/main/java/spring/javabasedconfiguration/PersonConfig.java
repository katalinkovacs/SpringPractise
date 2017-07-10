package spring.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person person(){

        System.out.println("Inside Person bean...................");
        Person person = new Person();
        System.out.println("new Person() created..................");
        person.setFname("Sebastian");
        person.setLname("Kovacs");
        return person;
    }


}
