package spring.beanscope;


public class HelloKati {

    private String helloKatiMsg;


 /*    ---------------------------------
    public String getHelloKatiMsg() {
        return "Hellobello";
    }
*/

    public void setHelloKatiMsg(String helloKatiMsg) {
        this.helloKatiMsg = helloKatiMsg;
    }

    public void getHelloKatiMsg() {
        System.out.println("Your helloKatiMsg is: " + helloKatiMsg);
    }
}
