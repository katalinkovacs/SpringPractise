package spring.annotation.required;

import org.springframework.beans.factory.annotation.Required;


public class Student {

    private int age;
    private String name;


    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //@Required
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
