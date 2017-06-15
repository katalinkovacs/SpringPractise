package spring.beaninheritance;


public class HelloZoli {

    private String msg1;
    private String msg2;


    public void setMessage1(String message1) {
        this.msg1 = message1;
    }

    public void getMessage1(){
        System.out.println("HelloZoli msg1: " + msg1);
    }

    public void setMessage2(String message2) {
        this.msg2 = message2;
    }

    public void getMessage2(){
        System.out.println("HelloZoli msg2: " + msg2);
    }


}
