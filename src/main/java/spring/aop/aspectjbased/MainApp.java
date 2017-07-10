package spring.aop.aspectjbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

    public static void main(String[] args) {

        System.out.println("MAIN started...................");

        ApplicationContext context = new ClassPathXmlApplicationContext("AopAspectjBased.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();

        student.printThrowException();
    }
}
