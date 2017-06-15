package spring.beanlifecycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        System.out.println("SpringMain has started.........");

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeansLifecycle.xml");  //WORKING

        //ApplicationContext context = new ClassPathXmlApplicationContext("BeansLifecycle.xml");    // NOT WORKING

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansLifecycle.xml");   //WORKING

        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansLifecycle.xml");   //WORKING

        System.out.println("Spring Context initialized");

        //MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
        EmployeeService service = context.getBean("employeeService", EmployeeService.class);

        System.out.println("Bean retrieved from Spring Context");

        System.out.println("Employee Name = " +service.getEmployee().getName());

        System.out.println("----------------------------");

        context.close();
        System.out.println("Spring Context Closed");
    }

}



