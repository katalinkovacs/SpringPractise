package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {

//this class is purely a 'marker' class to enable component scan on the current 'soundsystem' package
    // all classes within this package which has 'Component' annotation will be available in spring context.

}
