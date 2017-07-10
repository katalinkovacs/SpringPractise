package spring.eventhandling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beanpostprocessor.HelloWorld;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("************** STARTING PROGRAM **************");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandling.xml");
        System.out.println("context created");

        // Let us raise a start event.
        context.start();
        System.out.println("context START");

        Hello hello1 = (Hello) context.getBean("hello");
        hello1.getMessage();

        Hello hello2 = (Hello) context.getBean("hello2");
        hello2.getMessage();

        // Let us raise a stop event.
        context.stop();
        System.out.println("context STOP");



        ApplicationContext context2 = new AnnotationConfigApplicationContext(Hello.class);
        System.out.println("CONTEXT2 created.........");

        //    context2.start();   AND  context2.stop();       ?????????????????


        Hello hello3 = context2.getBean(Hello.class);
        System.out.println("hello3 created.................");
        hello3.setMessage("Hello Zolikam");
        hello3.getMessage();



        System.out.println("************** ENDING PROGRAM **************");
    }
}
