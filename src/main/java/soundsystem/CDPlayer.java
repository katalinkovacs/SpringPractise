package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {


    private CD cd;

  //  Put succinctly, autowiring is a means of letting Spring automatically satisfy a bean’s
  //  dependencies by finding other beans in the application context that are a match to
  //  the bean’s needs. To indicate that autowiring should be performed, you can use
  //  Spring’s @Autowired annotation.

    @Autowired
    public CDPlayer(CD cd){

        this.cd = cd;
    }

    public String play(){

        return cd.perform();
    }

}
