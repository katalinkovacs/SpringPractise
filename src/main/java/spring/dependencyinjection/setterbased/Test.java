package spring.dependencyinjection.setterbased;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

    public static void main(String[] args) {

        System.out.println("Mai started.............");

        //Resource resource = new ClassPathResource("BeansSetterDi.xml");
        //System.out.println("Resource obj created.");

        //BeanFactory factory = new XmlBeanFactory(resource);
        //System.out.println("BeanFactory obj created.");

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansSetterDi.xml");
        System.out.println("context created.");


        Employee emp = (Employee)context.getBean("employee");
        System.out.println("Employee obj created.");

        emp.display();

        System.out.println();

        Employee emp2 = (Employee)context.getBean("employee2");
        System.out.println("Employee2 created.");

        emp2.display();
    }
}
