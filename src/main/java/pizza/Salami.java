package pizza;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Salami  implements Toppings {

    public String topUp(){
        return "Salami";

    }
}
