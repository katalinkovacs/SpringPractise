package spring.initanddestroymethod;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args )

    {
        System.out.println("Main has started.");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"SpringCustomer.xml"});

        System.out.println("Context has been created.");

        CustomerService customerService = (CustomerService)context.getBean("customerService");
        System.out.println("customerService object has created.");

        System.out.println("customerService has been created: " + customerService);
        //System.out.println("customerService has been created. ");

        //System.out.println(customerService);

        context.close();
        System.out.println("Context has been closed.");


    }
}
