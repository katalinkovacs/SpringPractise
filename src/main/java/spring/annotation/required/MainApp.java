package spring.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotation.xml");

        // MainApp does not work with 'student bean' --> BeansAnnotation.xml
        Student student = (Student) context.getBean("student");
        System.out.println("Name is: " + student.getName() );
        System.out.println("Age is: " + student.getAge() );

        Student student2 = (Student) context.getBean("student2");
        System.out.println("Name is: " + student2.getName() );
        System.out.println("Age is: " + student2.getAge() );



    }
}
