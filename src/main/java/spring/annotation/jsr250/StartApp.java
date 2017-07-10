package spring.annotation.jsr250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

    public static void main(String[] args) {

        System.out.println("MAIN.........");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationjsr250.xml");

        System.out.println("CONTEXT created.........");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
        System.out.println("hello object created.........");

        System.out.println("getMessage method will be called on hello.........");
        hello.getMessage();
        System.out.println("getMessage method has been called on hello.........");

        System.out.println("BEFORE SHUTDOWNHOOK.........");
        context.registerShutdownHook();
        System.out.println("AFTER SHUTDOWNHOOK.........");

        System.out.println("FINISH.........");


    }
}
