package spring.dependencyinjection.setterbased;


public class Employee {

    private int id;
    private String name;
    private String city;

    public Employee() {
        System.out.println("Constructor - NO arguments - called");
    }

    public Employee(int id, String name, String city) {
        System.out.println("Constructor - 3 arguments - called");
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    void display(){
        System.out.println("Id is: " +id +". Name is: " +name +". City is: " +city +".");
    }
}
