package childcare;

import org.springframework.stereotype.Component;

@Component
public class Kati implements Child{

    public String eat(){
        return "Katalin is eating";
    }

}
