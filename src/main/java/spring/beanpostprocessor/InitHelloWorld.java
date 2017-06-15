package spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization( Object bean, String beanName ) throws BeansException {

        System.out.println("postProcessBeforeInitialization METHOD --> BeforeInitialization --> beanName is:  " + beanName);
        return bean;  // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessAfterInitialization METHOD --> AfterInitialization --> beanName is: " + beanName);
        return bean;  // you can return any other object as well
    }
}
