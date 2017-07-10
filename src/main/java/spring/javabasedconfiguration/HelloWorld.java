package spring.javabasedconfiguration;


public class HelloWorld {

    private String message;

    public HelloWorld() {
        System.out.println("Inside HelloWorld CONSTRUCTOR.............");
    }

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("My Message is: " + message);
    }
}
