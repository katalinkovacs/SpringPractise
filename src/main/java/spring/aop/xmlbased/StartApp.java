package spring.aop.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartApp {

    public static void main(String[] args) {

        System.out.println("Main started...............");

        ApplicationContext context = new ClassPathXmlApplicationContext("AopXmlBased.xml");
        System.out.println("Context created...............");


        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();


        // https://www.tutorialspoint.com/spring/schema_based_aop_appoach.htm    ?????????????????????????????????
        // AopXmlBased.xml ?????????????????????????????????????????

    }
}
