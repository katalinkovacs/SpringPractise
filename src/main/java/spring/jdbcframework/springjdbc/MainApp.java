package spring.jdbcframework.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


public class MainApp {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcSpring.xml");

        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Sebastian Kovacs", 3);
        studentJDBCTemplate.create("Oliver Kovacs", 3);
        studentJDBCTemplate.create("Reka Kallay", 6);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID is: " + record.getId() );
            System.out.print("Name is: " + record.getName() );
            System.out.println("Age is: " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID is: " + student.getId() );
        System.out.print("Name is: " + student.getName() );
        System.out.println("Age is: " + student.getAge());
    }
}
