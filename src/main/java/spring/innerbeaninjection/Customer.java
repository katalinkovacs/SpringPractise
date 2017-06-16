package spring.innerbeaninjection;


public class Customer {

    private Person person;

    public Customer() {
        System.out.println("Customer - Default constructor");
    }

    public Customer(Person person) {
        System.out.println("Customer - Constructor with argument.");
        this.person = person;
    }

    public void setPerson(Person person) {
        System.out.println("setPerson METHOD.");
        this.person = person;
    }


    @Override
    public String toString() {
        System.out.println("toString METHOD.");
        return "Customer [person = " + person + " ] ";
    }
}


