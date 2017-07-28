package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {


    // creates an Annotation based context
    public static void main(String ... args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoundsystemPackageConfig.class);

        // gets CD player from context
        // in CD player there is an autowired which means that spring automatically inject  a CD object from there
        // which CD ? becuase we have 2 FF and SB -- SB is marked Primary otherwise spring would not know which one to
        //inject
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);

        System.out.print(cdPlayer.play());




    }
}
