package pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza {

    private Toppings topping;

    @Autowired
    public Pizza(Toppings topping) {

        this.topping = topping;
    }

    public String put(){

        return "The topping is: " +topping.topUp();
    }
}
