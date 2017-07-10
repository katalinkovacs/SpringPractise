package spring.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Autowired.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
