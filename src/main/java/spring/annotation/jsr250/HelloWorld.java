package spring.annotation.jsr250;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

    private String message;

    // GETTERS SETTERS
    public void setMessage(String message){
        this.message  = message;
    }

    public String getMessage(){
        System.out.println("Your Message is: " + message);
        return message;
    }

    // METHODS

    @PostConstruct
    public void init(){
        System.out.println("INIT METHOD - Bean is going through init.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY METHOD - Bean will destroy now.");
    }
}
