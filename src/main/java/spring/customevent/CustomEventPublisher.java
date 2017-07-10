package spring.customevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class CustomEventPublisher implements ApplicationEventPublisherAware {


    private ApplicationEventPublisher publisher;


    public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
        System.out.println("INSIDE setApplicationEventPublisher METHOD...............");
        this.publisher = publisher;
    }

    public void publish() {
        System.out.println("INSIDE publish METHOD...............");
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }


}
