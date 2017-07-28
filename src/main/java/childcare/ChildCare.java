package childcare;

import org.springframework.stereotype.Component;

@Component
public class ChildCare {

    private Child child;


    public ChildCare(Child child) {

        this.child = child;
    }


    public String lunch(){
        return "Its a lunch for" + child.eat();
    }
}
