package spring.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        System.out.println("MAIN started.........");

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        System.out.println("CONTEXT created.........");

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println("helloWorld added to CONTEXT.........");

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(WelcomeConfig.class);
        System.out.println("CONTEXT2 created.........");

        Welcome welcome = context2.getBean(Welcome.class);
        System.out.println("welcome added to CONTEXT2.........");
        welcome.setWelcome("Kati!");
        welcome.getWelcome();

        Welcome welcome2 = context2.getBean(Welcome.class);
        System.out.println("welcome2 added to CONTEXT2.........");
        welcome2.setWelcome("Sebi!");
        welcome2.getWelcome();


        //ApplicationContext context3 = new ClassPathXmlApplicationContext(PersonConfig.class);   ???????????????/
        ApplicationContext context3 = new AnnotationConfigApplicationContext(PersonConfig.class);
        System.out.println("CONTEXT3 created.........");

        //Person person = (Person)context3.getBean("person");  ????????????
        Person person = context3.getBean(Person.class);
        System.out.println("person added to CONTEXT3.........");
        System.out.println("Person's first name: " + person.getFname());
        System.out.println("Person's last name: " + person.getLname());


        System.out.println("****************************");

        ApplicationContext context4 = new ClassPathXmlApplicationContext("JavaBasedConfig.xml");
        System.out.println("CONTEXT4 created.........");

        Person person2 = (Person)context4.getBean("person");
        System.out.println("Person's name: " + person2.getFname());
        System.out.println("Person's email: " + person2.getLname());

        System.out.println("************** ENDING PROGRAM **************");



    }
}
