package spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Main has started.");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansPostProcessor.xml");

        System.out.println("Context has been created.");

        HelloWorld obj = (HelloWorld) context.getBean("helloworld");

        System.out.println("HelloWorld obj has been created.");

        obj.getMessage();
        context.registerShutdownHook();
    }
}
