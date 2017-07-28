package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class FearFactory implements CD {

    public String perform(){
        return " Fear factory";

    }
}
