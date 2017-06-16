package spring.dependencyinjection.constructorbased2;


public class User {

    private String name;
    private int age;
    private String country;


    // CONSTRUCTORS
    public User (String name, int age, String country)
    {
        System.out.println("Constructor with 3 arguments");
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public User(String name, int age)
    {
        System.out.println("Constructor with 2 arguments  --> String name, int age ");
        this.name = name;
        this.age = age;
    }

    public User( int age, String country)
    {
        System.out.println("Constructor with 2 arguments  --> int age, String country ");
        this.age = age;
        this.country = country;
    }


    // SETTERS AND GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }




    // METHODS
    public String toString() {
        return name + " is " + age + " years old, living in " + country;
    }

    public void print() {
        System.out.println("Name is: " +name + " Age is: " + age +" Country is: "+ country);

    }


}
