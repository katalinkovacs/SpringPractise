package spring.beanlifecycle;

import spring.beanlifecycle.Employee;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeService implements InitializingBean, DisposableBean {

    private Employee employee;

    // SETTERS GETTERS
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // CONSTRUCTOR
    public EmployeeService(){
        System.out.println("EmployeeService no-args constructor called");
    }

    // CONSTRUCTOR
    public EmployeeService(Employee employee){
        this.employee = employee;
        System.out.println("EmployeeService - with argument - constructor called");
    }


    //@Override //IS NOT ALLOWED WHEN IMPLEMENTING INTERFACE METHOD
    public void destroy() throws Exception {
        System.out.println("EmployeeService Closing resources");
    }


    //@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("EmployeeService initializing to dummy value");
        if(employee.getName() == null){
            employee.setName("Pankaj");
        }
    }





}
