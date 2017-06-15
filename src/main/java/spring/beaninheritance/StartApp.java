package spring.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

    public static void main(String[] args) {

        System.out.println("Main has started.......");

        //ApplicationContext context = new ClassPathXmlApplicationContext("BeansInheritance.xml");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansInheritance.xml");

        System.out.println("Context has created.......");


        HelloKatus katus = (HelloKatus) context.getBean("hellokatus");
        System.out.println("katus object created.......");
        katus.getMessage1();
        katus.getMessage2();

        HelloSebi sebi = (HelloSebi) context.getBean("hellosebi");
        System.out.println("sebi object created.......");
        sebi.getMessage1();
        sebi.getMessage2();
        sebi.getMessage3();

        HelloZoli zoli = (HelloZoli) context.getBean("hellozoli");
        System.out.println("zoli object created.......");
        zoli.getMessage1();
        zoli.setMessage1("This is a New Hello Zoli message1.");
        zoli.getMessage1();
        zoli.getMessage2();

        HelloZoli zoli2 = (HelloZoli) context.getBean("hellozoli");
        System.out.println("zoli2 object created.......");
        zoli2.getMessage1();
        zoli2.getMessage2();

        HelloAnya anya1 = (HelloAnya) context.getBean("helloanya");
        System.out.println("anya1 object created.......");
        anya1.getMessage1();
        anya1.getMessage2();
        anya1.getMessage3();


        context.close();
        System.out.println("Context has been closed.");

    }
}
