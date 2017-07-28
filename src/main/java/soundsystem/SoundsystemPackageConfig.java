package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SoundsystemPackageConfig {

//this class is purely a 'marker' class to enable component scan on the current 'soundsystem' package
    // all classes within this package which has 'Component' annotation will be available in spring context.

   // With no further configuration, @ComponentScan will default to scanning the same
   // package as the configuration class. Therefore, because SoundsystemPackageConfig is in the
   // soundsystem package, Spring will scan that package and any subpackages underneath
   // it, looking for classes that are annotated with @Component.

}
