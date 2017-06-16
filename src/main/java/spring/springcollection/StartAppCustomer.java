package spring.springcollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppCustomer {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collection2.xml");

        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println(customer);

    }

}
