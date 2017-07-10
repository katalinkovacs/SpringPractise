package spring.javabasedconfiguration;


public class Welcome {

    private String welcome;

    public Welcome() {
        System.out.println("Inside WELCOME CONSTRUCTOR.............");
    }

    public void getWelcome() {
        System.out.println("Welcome " + welcome);
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
}
