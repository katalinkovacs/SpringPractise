package spring.beaninheritance;


public class WelcomeBye {

    String welcome;
    String bye;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String getBye() {
        return bye;
    }

    public void setBye(String bye) {
        this.bye = bye;
    }

    public void initWelcome() throws Exception {
        System.out.println("initWELCOME method after properties are set : " + welcome);
    }


    public void initBye() throws Exception {
        System.out.println("initBYE method: " + bye);
    }


}
