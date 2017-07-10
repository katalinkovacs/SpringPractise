package spring.customevent;

import org.springframework.context.ApplicationListener;


public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {
        System.out.println("INSIDE onApplicationEvent METHOD.............");
        System.out.println(event.toString());
    }



}
