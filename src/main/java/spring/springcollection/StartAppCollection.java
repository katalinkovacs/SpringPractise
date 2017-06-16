package spring.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppCollection {

    public static void main(String[] args) {

        System.out.println("MAIN.........");

        ApplicationContext context = new ClassPathXmlApplicationContext("Collection.xml");

        System.out.println("context.........");

        JavaCollection  jc = (JavaCollection) context.getBean("javacollection");
        System.out.println("jc.........");


        jc.getAddressList();
        System.out.println("getAddressList.........");

        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
