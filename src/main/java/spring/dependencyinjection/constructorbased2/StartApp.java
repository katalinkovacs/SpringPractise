package spring.dependencyinjection.constructorbased2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {


    public static void main(String[] args) {

        System.out.println("Main started...........");

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansConstructorDi2.xml");

        System.out.println("context created...........");

        User user1 = (User) context.getBean("user");
        System.out.println("user1 created...........");

        System.out.println(user1.toString());
        //user1.print();

        System.out.println(".......................");

        User user2 = (User) context.getBean("user2");
        System.out.println("user2 created...........");

        System.out.println(user2.toString());

        System.out.println(".......................");

        User user3 = (User) context.getBean("user3");
        System.out.println("user3 created...........");

        System.out.println(user3.toString());

        System.out.println(".......................");

    /*    //NOT WORKING!!!  --> String String

        User user4 = (User) context.getBean("user4");
        System.out.println("user4 created...........");

        System.out.println(user4.toString());
*/

        User user5 = (User) context.getBean("user5");
        System.out.println("user5 created...........");

        System.out.println(user5.toString());

        System.out.println(".......................");

    }
}
