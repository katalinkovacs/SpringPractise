package spring.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {

    public MyService(){
        System.out.println("MyService no-args constructor called");
    }


    @PostConstruct
    public void init(){
        System.out.println("MyService init method called");
    }

    //@PreDestroy
    public void destory(){
        System.out.println("MyService destroy method called");
    }

}
