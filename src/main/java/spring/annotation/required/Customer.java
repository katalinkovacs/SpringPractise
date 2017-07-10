package spring.annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class Customer {

    private Person person;
    private int type;
    private String action;

    @Required
    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
