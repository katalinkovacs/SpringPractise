package spring.eventhandling;


public class Hello {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("The Message: " + message);
    }
}
