package spring.annotation.autowired2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        System.out.println("Main started.........");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Context created.........");

        //A a = (A)context.getBean("a");
        A a = context.getBean("a",A.class);
        System.out.println("a created.........");
        System.out.println("a.display(): ");
        a.display();
        System.out.println("a.print(): ");
        a.print();

        B b = (B)context.getBean("b");
        System.out.println("b created.........");
        b.print();
    }
}
