package spring.innerbeaninjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCustPers {

    public static void main( String[] args )
    {
        System.out.println("Main started...........");

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"InnerBeans.xml"});

        System.out.println("context created...........");

        Customer customer1 = (Customer)context.getBean("customerbean2");
        System.out.println("customer1 created...........");

        System.out.println(customer1);

    }


}
