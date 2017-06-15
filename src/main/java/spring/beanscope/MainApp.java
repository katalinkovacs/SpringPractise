package spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        HelloKati hellokatiobject = (HelloKati) context.getBean("hellokati");
        hellokatiobject.getHelloKatiMsg();

        Hello helloobject = (Hello) context.getBean("hello");
        helloobject.printHello();

        System.out.println("------------------------------------");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        //objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.setMessage("I'm object B");
        objB.getMessage();

        HelloWorld objC = (HelloWorld) context.getBean("helloWorld");
        objC.getMessage();

        System.out.println("------------------------------------");

        HelloKati k1 = (HelloKati) context.getBean("hellokati");
        k1.getHelloKatiMsg();

        HelloKati k2 = (HelloKati) context.getBean("hellokati");
        k2.setHelloKatiMsg("Sziamia Katusbogar");
        k2.getHelloKatiMsg();

        HelloKati k3 = (HelloKati) context.getBean("hellokati");
        k3.getHelloKatiMsg();
        //https://www.tutorialspoint.com/spring/spring_bean_scopes.htm
        // --> Your Message : I'm object A
        // --> Your Message : null

    }
}
