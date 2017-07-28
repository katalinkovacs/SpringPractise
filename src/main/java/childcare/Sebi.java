package childcare;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Sebi implements Child {

    public String eat(){
        return "Sebastian is eating";
    }


}
